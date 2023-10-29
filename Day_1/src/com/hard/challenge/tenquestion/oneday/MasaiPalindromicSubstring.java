package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MasaiPalindromicSubstring {
	
	/*
	 * sample input:                             sample output:
	 * 
	 * thisracecarisgood                           7
	 * 
	 * 
	 * Hint:
	 * the given string contains a palindromic substring which is "racecar" and it is 
	 *    largest length (7) among all other palindromic substrings
	 *    
	 *    hence the output is 7
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("enter you string");
		
		Scanner sc= new Scanner(System.in);
		
		char[] strArr= sc.nextLine().toCharArray();
		
		int max=0;
		for(int i=0; i<=strArr.length-1; i++) {
			StringBuilder bag= new StringBuilder();
			for(int j=i; j<=strArr.length-1; j++) {
				bag.append(strArr[j]);
				
			if(	checkPalindrome(bag.toString()) && max<bag.length()){
					max=bag.length();
				}
			}
		}
		
		System.out.println(max);
	}

	private static boolean checkPalindrome(String str) {
		// TODO Auto-generated method stub
		
		char[] strArr= str.toCharArray();
		
		StringBuilder bag= new StringBuilder();
		for(int i=strArr.length-1; i>=0; i--) {
			bag.append(strArr[i]);
		}
		
		if(bag.toString().equals(str)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	

}

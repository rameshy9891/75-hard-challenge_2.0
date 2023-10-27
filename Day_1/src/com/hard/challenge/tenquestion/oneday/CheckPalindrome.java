package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class CheckPalindrome {

	/*
	 * sample input:
	 * 6
	 * nrupul
	 * 
	 * sample output:
	 * No
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length of the string");
		int len=sc.nextInt();
		
		sc.nextLine();
		
		String str= sc.nextLine();
		char[] strArr= str.toCharArray();
		
		StringBuilder bag= new StringBuilder();
		for(int i= strArr.length-1; i>=0; i--) {
			bag.append(strArr[i]);
		}
		
		if(str.equals(bag.toString())) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}

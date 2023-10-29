package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class SubStringUnderCondition {
	
	/*
	 * sample input:                           sample output:
	 * abcab                                     7
	 * 
	 * 
	 * Hint:- substrings of abcab which start and end with same characters,
	 *                          like:- a,abca,b,bcab,c,a,b.
	 *    
	 *    so total count is 7 . Hence we print 7.
	 */
	
	public static void main(String[] args) {
		System.out.println("enter the string");
		
		Scanner sc= new Scanner(System.in);
		
		char[] strArr= sc.nextLine().toCharArray();
		int count=0;
		for(int i=0; i<=strArr.length-1; i++) {
			
			StringBuilder bag= new StringBuilder();
			for(int j=i; j<=strArr.length-1; j++) {
				
				bag.append(strArr[j]);
				System.out.println(bag);
				
				if(bag.charAt(0)==bag.charAt(bag.length()-1)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	

}

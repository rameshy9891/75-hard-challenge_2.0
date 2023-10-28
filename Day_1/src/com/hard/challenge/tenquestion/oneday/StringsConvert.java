package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class StringsConvert {
	
	/*
	 * sample input:                        sample output:
	 * 5 
	 * aBbcd                                  AbBCD
	 */

	public static void main(String[] args) {
		System.out.println("enter the lenght of the string");
		
		Scanner sc = new Scanner(System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		char[] strArr= sc.nextLine().toCharArray();
		
		StringBuilder bag= new StringBuilder();
		for(int i=0; i<=len-1; i++) {
			if(strArr[i]==Character.toUpperCase(strArr[i])) {
				bag.append(Character.toLowerCase(strArr[i]));
			}
			else {
				bag.append(Character.toUpperCase(strArr[i]));
			}
		}
		
		System.out.println(bag.toString());
		
	}
}

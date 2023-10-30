package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class VowelHalf {
	
	/*
	 * Desciption:
	 * you have to print True, if more than half the characters in the strings are vowels , else print False
	 * 
	 * sample input:                           sample output:
	 * 6
	 * aabefe                                     True
	 */
	
	public static void main(String[] args) {
		System.out.println("enter the length of the string");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		String str= sc.next().toLowerCase();
		
		char[] strArr= str.toCharArray();
		
		int count=0;
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]=='a'||strArr[i]=='e'||strArr[i]=='i'||strArr[i]=='o'||strArr[i]=='u') {
				count++;
			}
		}
		
		System.out.println(((len/2)<=count?"True":"False"));
	}

}

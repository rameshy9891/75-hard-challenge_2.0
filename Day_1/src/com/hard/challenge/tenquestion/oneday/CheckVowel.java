package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class CheckVowel {
/*
 * sample input:
 * 4
 * stvr
 * sample output:
 * false
 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter the length of the string");
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		char[] strArr= sc.nextLine().toCharArray();
		
		int count=0;
		
		for(int i=0; i<=strArr.length-1; i++) {
			
			if(strArr[i]=='a'||strArr[i]=='e'||strArr[i]=='i'||strArr[i]=='o'||strArr[i]=='u') {
				count++;
			}
		}
		
		if (count>=1) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}
}

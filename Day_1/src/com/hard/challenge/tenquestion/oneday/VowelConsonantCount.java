package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class VowelConsonantCount {
	
	/*
	 * sample input:                          sample output:
	 * 6
	 * ankush                                   2 4
	 */
	
	public static void main(String[] args) {
		
		System.out.println("enter the length of the string");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		String str= sc.nextLine().toLowerCase();
		
		char[] strArr= str.toCharArray();
		
		int consoCount=0;
		int vowelCount=0;
		for(int i=0; i<=strArr.length-1; i++) {
			if(strArr[i]=='a'||strArr[i]=='e'||strArr[i]=='i'||strArr[i]=='o'||strArr[i]=='u') {
				vowelCount++;
			}else {
				consoCount++;
			}
		}
		
		System.out.println(vowelCount+" **** "+ consoCount);
	}

}

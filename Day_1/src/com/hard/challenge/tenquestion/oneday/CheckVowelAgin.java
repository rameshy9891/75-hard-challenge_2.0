package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class CheckVowelAgin {
	
	/*
	 * sample input:                        sample output:
	 * 4
	 * stvr                                  false;
	 */

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the lenth of the string");
		
		int len= sc.nextInt();
		
		sc.nextLine();
		int count=0;
		
		char[] strArr= sc.nextLine().toCharArray();
		
		for(int i=0; i<=strArr.length-1; i++) {
			
			if(strArr[i]=='a'||strArr[i]=='e'||strArr[i]=='i'||strArr[i]=='o'||strArr[i]=='u') {
				count++;
			}
		}
		
		System.out.println(count>0?"Yes":"No");
	}
}

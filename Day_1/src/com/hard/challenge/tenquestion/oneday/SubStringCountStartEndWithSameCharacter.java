package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class SubStringCountStartEndWithSameCharacter {
	
	
	/*
	 * sample input: abcab           sample output: 7
	 * 
	 * hint: a,abca,b,bcab,c,a,b
	 */
	
	public static void main(String[] args) {
		
		System.out.println("enter the string ");
		
		Scanner sc = new Scanner(System.in);
		
		char[] strArr= sc.nextLine().toCharArray();
		
		
		int count=0;
		
		
		for(int i=0; i<strArr.length; i++) {
			
			StringBuilder bag= new StringBuilder();
			for(int j=i; j<strArr.length; j++) {
				
				bag.append(strArr[j]);
				
				//System.out.println(bag);
				
				if(bag.charAt(0)==bag.charAt(bag.length()-1)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

	
	

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class RemoveUpperCase {
	
	/*
	 * sample input:                    sample output:
	 * 5
	 * MasAi                             asi
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of string");
		
		int len=sc.nextInt();
		
		sc.nextLine();
		
		String str= sc.nextLine();
		
		StringBuilder bag= new StringBuilder();
		
		for(int i=0; i<len; i++) {
			
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				bag.append(str.charAt(i));
			}
		}
		
		System.out.println(bag.toString());
	}

}

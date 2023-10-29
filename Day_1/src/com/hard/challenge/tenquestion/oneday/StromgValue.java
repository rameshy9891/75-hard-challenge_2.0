package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class StromgValue {
	
	/*
	 * sample input:        sample output:
	 * 
	 * aba                   4
	 */
	
	public static void main(String[] args) {
		
		String str="abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("enter your string");
		
		Scanner sc= new Scanner(System.in);
		
		
		char[] inputArr=sc.nextLine().toCharArray();
		
		int sum=0;
		
		for(int i=0; i<=inputArr.length-1; i++) {
			//char currentChar= inputArr[i];
			
			int value= (str.indexOf(inputArr[i])+1);
			
			sum=sum+value;
		}
		
		System.out.println(sum);
		
	}

}

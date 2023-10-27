package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class OddEvenAndBoth {

	/*
	 * one , two
	 * 
	 * if both the values are even , print Even
	 * 
	 * Else if both the values are odd, print Odd
	 * 
	 * else print Even-odd
	 * 
	 * sample input:
	 * 3 6
	 * 
	 * sample output:
	 * 
	 * Even-Odd
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter the first value");
		
		int one= sc.nextInt();
		
		System.out.println("enter the second value ");
		
		int two= sc.nextInt();
		
		
		if(one%2==0 && two%2==0) {
			System.out.println("Even");
		}
		
		else if(one%2==1 && two%2==1) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Even-Odd");
		}
	}
}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class IdentifyPrime {

	/*
	 * Note: a prime number is a number , that is divisible by only 1 and the number itself
	 * 
	 * sample input:
	 * 13
	 * sample output:
	 * Yes
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number check for prime");
			int num=sc.nextInt();
			
			int count=0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
	}
}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class IdentifyPrimeNum {
	
	/*
	 * sample input:             sample output:
	 * 13                           Yes
	 */
	
	public static void main(String[] args) {
		
		System.out.println("enter the number which you \n find the that number is prime or not");
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		
		System.out.println(count==2?"Yes":"No");
	}

}

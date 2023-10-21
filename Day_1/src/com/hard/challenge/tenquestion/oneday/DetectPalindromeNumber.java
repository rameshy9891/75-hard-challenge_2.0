package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class DetectPalindromeNumber {

	/*
	 * sample input: 1221                sample output: "Yes"
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number here");
		int number= sc.nextInt();
		
		
		int temp= number;
		
		int bag=0;
		
		while(number>0) {
		bag=	(bag*10)+(number%10);
		
		number= Math.floorDiv(number, 10);
		
		
		}
		
		if(temp==bag) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class TheLastDigit {
	/*
	 * sample input:                    sample output:
	 * 126                               "Divisible"
	 */
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int mod= num%10;
		
		System.out.println(mod%3==0?"Divisible":"Not Divisible");
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class ReverseTheValue {
	/*
	 * sample input:
	 * 971
	 * sample output:
	 * 179
	 */

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number do you want reverse");
		int num= sc.nextInt();
		int bag=0;
		while(num>0) {
			bag=bag*10+(num%10);
			
			num=(int) Math.ceil(num/10);
		}
		
		System.out.println(bag);
	}
}

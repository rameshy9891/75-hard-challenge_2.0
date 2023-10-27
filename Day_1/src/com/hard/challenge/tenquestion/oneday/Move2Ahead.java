package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class Move2Ahead {

	/*
	 * sample input:
	 * 12
	 * sample output:
	 * 2
	 * 4
	 * 6
	 * 8
	 * 10
	 * 12
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the input");
		
		int num= sc.nextInt();
		for(int i=2; i<=num; i++) {
			if(i%2==0) {
				System.out.println("even number:-:" + i);
			}
		}
	}
}

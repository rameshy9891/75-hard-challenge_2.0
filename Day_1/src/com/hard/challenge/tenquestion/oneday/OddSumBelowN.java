package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class OddSumBelowN {

	/*
	 * sample input:
	 * num=5
	 * 1 
	 * 3
	 * 5
	 * 
	 * sample output:
	 * 9
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int num= sc.nextInt();
		
		int bag=0;
		for(int i=1; i<=num; i++) {
			if(i%2==1) {
				bag=bag+i;
			}
		}
		
		System.out.println(bag);
	}
}

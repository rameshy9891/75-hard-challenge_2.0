package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class OddSumAgain {
/*
	sample input:
		
		N=3
		
		sample output:
		1
		1
		4
		
		*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int N= sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			int bag=0;
			for(int j=1; j<=i; j++) {
				if(j%2==1) {
					bag=bag+j;
				}
			}
			System.out.println(bag);
		}
	}
}

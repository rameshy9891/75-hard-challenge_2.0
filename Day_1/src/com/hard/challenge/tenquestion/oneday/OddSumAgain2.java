package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class OddSumAgain2 {
	
	/*
	 * sample input:                   sample output:
	 * 4                                   1
	 *                                     1
	 *                                     4
	 *                                     4
	 *                                   
	 */                                    
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int sum=0;
			for(int j=1; j<=i; j++) {
				if(j%2==1) {
					sum=sum+j;
				}
			}
			System.out.println(sum);
		}
		
		
	}

}

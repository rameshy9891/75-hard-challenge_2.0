package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class EvenSumAgain2 {
	
	/*
	 * sample input:                          sample output:
	 * 5       
	 * 1 2 3 4 5                                   6
	 */

	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		
		System.out.println(sum);
	}
}

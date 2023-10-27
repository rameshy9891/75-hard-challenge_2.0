package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class RunningSumOfAnArray {
	/*
	 * sample input:
	 * 
	 * 1
	 * 5
	 * 1 2 3 4 5 
	 * 
	 * sample output:
	 * 
	 * 1 3 6 10 15
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the test case");
		int tc= sc.nextInt();
		
		while(tc-->0) {
			
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		System.out.println("enter the array");
		
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		RunningSum(len,arr);
		
		
		}
		
		
		
	}

	private static void RunningSum(int len, int[] arr) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			System.out.print(sum+" ");
		}
		
	}

}

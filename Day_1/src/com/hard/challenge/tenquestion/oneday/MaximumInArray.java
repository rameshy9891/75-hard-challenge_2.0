package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MaximumInArray {
	
	/*
	 * sample input:                         sample output:
	 * 5
	 * 1 2 3 4 5                              5
	 */

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		System.out.println("enter the array here");
		
		int[] arr= new int[len];
		
		for(int i=0; i<=arr.length-1; i++) {
			arr[i]=sc.nextInt();
		}
		
	int max=arr[0];
	
	for(int i=0; i<=arr.length-1; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	
	System.out.println(max);
		
	}
}

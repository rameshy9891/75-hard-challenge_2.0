package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MinimumInArray2 {
	
	/*
	 * sample input:                     sample output:
	 * 5
	 * 1 2 3 4 5                            1
	 */
	
	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int max=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MaximumInTheArray {

	/*
	 * sample input:
	 * 5
	 * 1 2 3 4 5
	 * 
	 * sample output:
	 * 5
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the lengt of the array");
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		
		for(int i=0; i<=arr.length-1; i++) {
		arr[i]=sc.nextInt();	
		}
		
		int max=arr[0];
		
		for(int j=0; j<=arr.length-1; j++) {
			if(max<arr[j]) {
				max=arr[j];
			}
		}
		
		System.out.println(max);
	}
}

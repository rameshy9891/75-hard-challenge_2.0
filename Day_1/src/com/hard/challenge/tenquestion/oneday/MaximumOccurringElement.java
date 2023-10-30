package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MaximumOccurringElement {
	
	/*
	 * sample input:                              sample output:
	 * 5
	 * 0 2 0 6 9                                    0
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int max=0;
		int element=0;
		
		for(int i=0; i<=arr.length-1; i++) {
			int count=0;
			for(int j=0; j<=arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(max<count) {
				max=count;
				element= arr[i];
			}
		}
		
		System.out.println("elenment is :="+ element +"  occurance is:="+ max);
		
	}

}

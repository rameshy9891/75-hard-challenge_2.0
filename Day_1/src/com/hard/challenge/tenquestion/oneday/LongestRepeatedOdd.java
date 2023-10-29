package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class LongestRepeatedOdd {
	
	/*
	 * Description:
	 * Your task to find the maximum number of  times an odd number is continuously repeated in the array
	 * 
	 * sample input:
	 * 12
	 * 1 1 1 1 2 2 2 2 1 1 1
	 * 
	 * sample output:
	 * 4
	 */

	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		Scanner sc= new Scanner(System.in);
		
		int len=sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int max=0;
		
		for(int i=0; i<=arr.length-1; i++) {
			int count=0;
			for(int j=i; j<=arr.length-1; j++) {
				if(arr[j]%2==0 && arr[i]==arr[j]) {
					count++;
				}
				else {
					break;
				}
			}
			
			if(max<count) {
				max=count;
			}
		}
		
		System.out.println(max);
	}
	
}

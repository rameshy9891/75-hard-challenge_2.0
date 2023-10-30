package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class OddArraySum {
	
	/*
	 * sample input:                   sample output:
	 * 5
	 * 1 2 3 4 5                         9
	 * 
	 * hint:= The odd numbers in the array are 1 3 5
	 * 
	 * 1 + 3 + 5 = 9
	 */
	
	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		
		Scanner sc= new Scanner(System.in);
		
		int len=sc.nextInt();
		
		
		System.out.println("enter array here");
		
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				sum=sum+arr[i];
			}
		}
		
		System.out.println(sum);
		
	}

}

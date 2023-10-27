package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class HighestStockValue {
	
	/*
	 * sample input :
	 * 5
	 * 1 -3 4 3 -2
	 * 
	 * sample output:
	 * 5
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int sum =0;
		int max=0;
		for(int i=0; i<=arr.length-1; i++) {
            
			sum=sum+arr[i];
			
			if(sum>max) {
				max=sum;
			}
			
		}
		System.out.println(max);
		
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class FindMaximumInArray {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		int len= sc.nextInt();
		
		System.out.println("enter the array here");
		int[] arr= new int[len];
		
		for(int i =0; i<=len-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int max=arr[0];
		
		for(int j=0; j<=arr.length-1; j++) {
			
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		
		System.out.print(max);
	}

}

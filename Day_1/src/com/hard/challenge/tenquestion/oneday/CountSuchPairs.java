package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class CountSuchPairs {
	
	/*
	 * sample input:                    sample output:
	 * 5 9
	 * 3 0 6 2 7                          2
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int k= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0;  i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]+arr[j]==k) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}

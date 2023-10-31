package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class AppearOnce {
	
	/*
	 * sample input:                         sample output:
	 * 7
	 * 3 5 3 3 8 5 6                             14
	 * 
	 * Hint:
	 * arr=[3 5 3 3 8 5 6]
	 * 
	 * 8 occurs 1 time
	 * 6 occurs 1 time
	 * 5 occurs 2 times
	 * 3 occurs 3 times
	 * 
	 * Thus the required output will be 8 + 6=14
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0; i<=n-1; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		check(n,arr);
		
	}

	private static void check(int n, int[] arr) {
		// TODO Auto-generated method stub
		
		int[] count= new int[101];
		
		for(Integer num: arr) {
			count[num]++;
		}
		
		int sum=0;
		for(int i=0; i<count.length; i++) {
			if(count[i]==1) {
				
				sum=sum+i;
				
			}
		}
		
		System.out.println(sum);
		
	}

}

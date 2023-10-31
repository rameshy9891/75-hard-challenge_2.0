package com.hard.challenge.tenquestion.oneday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SugregationOfOddAndEven {
	/*
	 * sample input:                      sample output:
	 * 2 
	 * 5
	 * 1 2 3 4 5                           2 4 1 3 5
	 * 1
	 * 5
	 * 1 2 3 4 5                           1 3 5 2 4
	 * 2
	 * 
	 * 
	 * Hint:
	 * if q=1 then first print even element 
	 * if q=2 or anything then first print odd element 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the teste case");
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			System.out.println("enter the length of the array");
			int len=sc.nextInt();
			
			System.out.println("enter your array here");
			
			int[] arr= new int[len];
			for(int j=0; j<len; j++) {
				arr[j]=sc.nextInt();
			}
			
			System.out.println("enter here q value ");
			int q= sc.nextInt();
			
			
			check(len,arr,q);
		}
	}

	public static void check(int len, int[] arr, int q) {
		// TODO Auto-generated method stub
		
		List<Integer> even= new ArrayList<>();
		
		List<Integer> odd= new ArrayList<>();
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0 ) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		
		
	  if(q==1) {
		  for(Integer bag:even) {
			  System.out.print(bag+" ");
		  }
		  for(Integer bag: odd) {
			  System.out.print(bag+" ");
		  }
		  System.out.println();
	  }else {
		  for(Integer bag:odd) {
			  System.out.print(bag+" ");
		  }
		  for(Integer bag: even) {
			  System.out.print(bag+" ");
		  }
		  System.out.println();
	  }
		
	}

}

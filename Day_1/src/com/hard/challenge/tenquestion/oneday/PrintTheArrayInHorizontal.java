package com.hard.challenge.tenquestion.oneday;

import java.util.Arrays;
import java.util.Scanner;

public class PrintTheArrayInHorizontal {
	
	/*
	 * sample input:                  sample output:
	 * 5      
	 * 1 2 3 4 5                        1 2 3 4 5 
	 */

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0; i<=n-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			//if you want to print horizatal then don't use println use print only
			System.out.print(arr[i]+" ");
		}
	}
}

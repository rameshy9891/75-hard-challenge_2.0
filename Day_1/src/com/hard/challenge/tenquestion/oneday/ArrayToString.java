package com.hard.challenge.tenquestion.oneday;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
	
	/*
	 * sample input: 
	 * 5
	 * 2 -4 6 8 -9
	 * 
	 * sample output:
	 * 
	 * 20680
	 * 
	 * 
	 * if number less then 0 then print 0 in string
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		System.out.println("enter the array");
		
		int[] arr= new int[len];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(arr));
		
		for(int j=0; j<arr.length; j++) {
			
			if(arr[j]<0) {
				System.out.print("0");
			}
			else {
				System.out.print(arr[j]);
			}
		}
	}

}

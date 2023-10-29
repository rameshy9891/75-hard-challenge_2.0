package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class IntersectionOfArray {
	/*
	 * sample input:                  sample output:
	 * 3
	 * 4 5 7                            5
	 * 9 2 5
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		int[] arr1=new int[len];
		int[] arr2=new int[len];
		
		for(int i=0; i<len; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<len; i++) {
			arr2[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}

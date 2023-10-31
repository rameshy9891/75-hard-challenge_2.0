package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class CartTotal {
	
	/*
	 * sample input:                            sample output:
	 * 3
	 * 100 20 40                                  300
	 * 2 1 2
	 * 
	 * hint: cart total= (100*2+20*1+40*2)=(200+20+80)=300
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		
		int len= sc.nextInt();
		
		
		int[] arr1= new int[len];
		int[] arr2= new int[len];
		
		System.out.println("enter the first array");
		
		for(int i=0; i<=len-1; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the second array");
		
		for(int i=0; i<=len-1; i++) {
			arr2[i]=sc.nextInt();
		}
		
		
		
		//solution start here
		int sum=0;
		for(int i=0; i<=len-1; i++) {
			sum=sum+(arr1[i]*arr2[i]);
		}
		
		System.out.println(sum);
	}

}

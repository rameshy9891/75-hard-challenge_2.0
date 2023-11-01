package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class FibonachiSeries {
	
	/*
	 * 0 1 1 2 3 5 8 13 21
	 */
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		int c;
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.print(a+" "+b+" ");
		
		for(int i=1; i<=num; i++) {
			
			
			
			c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}

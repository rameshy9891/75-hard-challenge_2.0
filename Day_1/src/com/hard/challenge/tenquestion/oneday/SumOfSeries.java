package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class SumOfSeries {
	
	/*
	 * sample input:
	 * 
	 * give N=3, X=2
	 * 
	 * we need to find the sum of first  N=3 terms, having value of x=2
	 * First 3 terms in Expression = 1 + x + x*x= 1 + 2 + 2*2=7
	 * answer is 7
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the N value");
		
		int N= sc.nextInt();
		
		System.out.println("enter the X value");
		
		int X= sc.nextInt();
		
		double sum=0;
		
		if(X<=0 && N<=0) {
			System.out.println("-1");
		}
		else {
			
			
			for(int i=0; i<N; i++) {
				sum=sum+Math.pow(X, i);
			}
		}
		
		int res= (int) sum;
		
		System.out.println(res);
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class SumOfSeries2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the N here");
		int N= sc.nextInt();
		
		System.out.println("enter the X here");
		
		
		int X= sc.nextInt();
		
		
		if(X<=0 && N<=0) {
			System.out.println("-1");
		}
		else {
			int bag=0;
			
			for( int i=0; i<=N-1; i++) {
				bag=(int) (bag+Math.pow(X, i));
			}
			
			System.out.println(bag);
		}
		
	}

}

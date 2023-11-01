package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class FibonachiSeriesUsingFactorial {
	
	static int a=0,b=1,c;
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		System.out.print(a+" "+b+" ");
		
		getFectorial(num);
	}
	private static void getFectorial(int num) {
		// TODO Auto-generated method stub
		
		if(num>=1) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			getFectorial(num-1);
		}
		
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class FindFactorial {
	
	static int factret=1;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number here");
		int num=sc.nextInt();
		
	int res=	findFactorial(num);
	
	System.out.println("the number is :"+num+" and factorial is :"+res);
	}

	private static int findFactorial(int num) {
		// TODO Auto-generated method stub
//		
//		if(num>=1) {
//			factret=factret*num;
//			
//			findFactorial(num-1);
//		}
//		
//		return factret;
		
		if(num==0) {
			return 1;
		}
		else {
			return num*(findFactorial(num-1));
		}
		
	}

}

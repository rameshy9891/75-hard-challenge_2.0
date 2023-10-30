package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class EvenSumAgain {
	
	/*
	 * sample input:                           sample output:
	 * 4                                          0
	 *                                            2
	 *                                            2
	 *                                            6
	 */
	
	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the number ");
	  int n= sc.nextInt();
	  
	  for(int i=1; i<=n; i++) {
		  int sum=0;
		  for(int j=1; j<=i; j++) {
			  if(j%2==0) {
				  sum=sum+j;
			  }
		  }
		  System.out.println(sum);
	  }
	  
	  
	}

}

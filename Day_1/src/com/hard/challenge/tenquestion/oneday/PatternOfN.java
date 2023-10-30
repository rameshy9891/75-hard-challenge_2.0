package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class PatternOfN {

	/*
	 * Description:
	 * you have to print all the numbers in the range from 1 to N*N , such that there are exactly N numbers on each line
	 * 
	 * 
	 * sample input:                         sample output:
	 * 3                                     1 2 3
	 *                                       4 5 6
	 *                                       7 8 9
	 *                                       
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int count=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

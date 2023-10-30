package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MapNumber {
	
	/*
	 * sample input:                         sample output:
	 * 5                  
	 * 10                                      1-10
	 *                                         2-11
	 *                                         3-12
	 *                                         4-13
	 *                                         5-14
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int count=sc.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println(i+" - "+count);
			count++;
		}
	}

}

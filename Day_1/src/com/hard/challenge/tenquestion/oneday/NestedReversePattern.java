package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class NestedReversePattern {
	
	/*
	 * sample input:                     sample output:
	 * 4                                 4 3 2 1
	 *                                   4 3 2 1
	 *                                   4 3 2 1
	 *                                   4 3 2 1
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		for(int i=num; i>=1; i--) {
           for(int j=num; j>=1; j--) {
        	   System.out.print(j+" ");
           }
           System.out.println();
		}
	}

}

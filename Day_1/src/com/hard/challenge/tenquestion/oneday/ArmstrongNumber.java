package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class ArmstrongNumber {
	
	
	/*
	 * sample input:                             sample output:
	 * 153                                            Yes
	 * 
	 * Hint:
	 * we have one number that length should be any first we count the length of the number
	 * after that like 153 have length 3 so find the all number and (1)^3+(5)^3+(3)^3 so that 1+125+27  = 153
	 * so that's whay it is armstrong number.
	 * 
	 * 
	 */

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number which you want check");
		int num=sc.nextInt();
		
		int temp=num;
		int temp2=num;
		int len=0;
		int sum=0;
		
		while(temp>0) {
			temp = temp / 10;
			len=len+1;
		}
		
		//System.out.println(len);
		
		while(temp2>0) {
			int rem= temp2 % 10;
			
			int mul=1;
			
			for(int i=1; i<=len; i++)
			{
				mul=mul*rem;
			}
		temp2=	temp2 / 10;
			sum=sum+mul;
		}
		
		System.out.println((sum==num?"Yes":"No"));
		
	}
}

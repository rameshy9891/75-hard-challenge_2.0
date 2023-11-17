package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class GcdOrLcm {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plese enter first number");
		
		int num1=sc.nextInt();
		
		System.out.println("pls enter secound number");
		
		int num2= sc.nextInt();
		
		int onum1=num1;
		
		int onum2=num2;
		
		int HCF=1;
		
	for(int i=num1; i>=1; i--) {
		if(num1%i==0 && num2%i==0) {
			//System.out.println(i);
			
			HCF=i;
			break;
		}
	}
	
	int LCM=(onum1*onum2)/HCF;
	
	System.out.println("hcf is"+ HCF);
	System.out.println("lcm is"+ LCM);

	}

}

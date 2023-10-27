package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class ApplyBrakes {

	/*
	 * distance,time
	 * 
	 * find the value of speed , such that
	 * 
	 * speed = distance/time
	 * 
	 * if the following expression is true
	 * 
	 * speed>40, print "apply breake"
	 * 
	 * else 
	 * print "keep going"
	 * 
	 * sample input: 
	 * 100 2
	 * sample output:
	 * apply brake
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter distance");
		int dis= sc.nextInt();
		
		System.out.println("enter time here");
		int time= sc.nextInt();
		
		double speed=Math.ceil(dis/time);
		
		
		if(speed>40) {
			System.out.println("apply brake");
		}
		
		else {
			System.out.println("keep going");
		}
		
	}
}

package com.hard.challenge.tenquestion.oneday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewYourkSklines {
	
	/*
	 * sample input:                              sample output:
	 * 
	 * 2
	 * 5
	 * 1 4 3 2 7                                   0 2 1 0 1
	 * 2
	 * 1 3                                         0 1
	 * 
	 * hint:
	 * we will check in this left right value both are small then give 2 score if one is smaller one is greater then 1 score
	 * it non is greater then 0
	 * 
	 * like":
	 * 
	 * 1 left is nothing and right is 4 so are 1 is not greater then any then answer 0.
	 * 4 left is one so 4 one side small sore 1 and right side also small then sore 2 so that answer is 2
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ente here test case");
		
		int tc= sc.nextInt();
		
		for(int t=0; t<tc; t++) {
			System.out.println("enter the lenght of the array");
			
			int len=sc.nextInt();
			
			System.out.println("enter the array");
			
			int[] arr= new int[len];
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			check(len,arr);
		}
	}

	private static void check(int len, int[] arr) {
		// TODO Auto-generated method stub
		
		StringBuilder bag= new StringBuilder();
		List<Integer> list= new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			
			
			
			if( (i>0 && arr[i-1]<arr[i]) && (i<len-1 && arr[i+1]<arr[i])) {
				bag.append(2).append(" ");
				list.add(2);
			}
			
			else if((i>0 && arr[i-1]<arr[i]) || (i<len-1 && arr[i+1]<arr[i])) {
				bag.append(1).append(" ");
				list.add(1);
			}
			else {
				bag.append(0).append(" ");
				list.add(0);
			}
			
			
			
		}
		
		System.out.println(bag.toString());
		System.out.println(list);
		
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class MissingVowels {
	
	/*
	 * Description:
	 * 
	 * out of the 5 vowel (a,e,i,o,u)
	 * the word "nature" contains a,u,e
	 * the vowel that are not present in the string are : i,o
	 * hence the output is : io
	 * 
	 * Note: the string contains only lower case English Alphabets;
	 * 
	 * sample intput:                 sample output:
	 * 6
	 * nature                            io
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		char[] strArr=sc.nextLine().toCharArray();
		
		String vowel= "aeiou";
		
		char[] vowelArr= vowel.toCharArray();
		
		StringBuilder bag= new StringBuilder();
		for(int i=0; i<=vowelArr.length-1; i++) {
		
			
			boolean missingVowel=true;
			for(int j=0; j<=strArr.length-1; j++) {
				if(vowelArr[i]==strArr[j]) {
					
					missingVowel=false;
					break;
				}
			}
			
			if(missingVowel) {
				bag.append(vowelArr[i]);
			}
			
			
		}
		
		
		System.out.println(bag.toString());
		
	}
}

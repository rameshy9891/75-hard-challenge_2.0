package com.hard.challenge.tenquestion.oneday;

import java.util.Scanner;

public class VowelAndConsonantCount {
	
	/*
	 * sample input:
	 * 6
	 * nrupul
	 * sample output:
	 * 2 4
	 * 
	 * Note: All charcters in the string are lowercase English alphabets
	 * 
	 * Note: The vowels in the English alphabet are the following - a , e , i ,o ,u
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the lenght of the string");
		int len= sc.nextInt();
		
		sc.nextLine();
		
		String str= sc.nextLine().toLowerCase();
		
		char[] strArr= str.toCharArray();
		
		int vowel=0;
		int conso=0;
		
		for(int i=0; i<=strArr.length-1; i++) {
			if(strArr[i]=='a' ||strArr[i]=='e' || strArr[i]=='i' || strArr[i]=='o' || strArr[i]=='u') {
				vowel++;
			}
			else {
				conso++;
			}
		}
		
		System.out.println(vowel+" "+conso);
	}

}

package com.hard.challenge.tenquestion.oneday;

public class FindVowelAndCon {
	
	public static void main(String[] args) {
		
		
		String s="Technologies";
		
		String str=s.toLowerCase();
		
		char[] strArr= str.toCharArray();
		
		int countVowel=0;
		int cons=0;
		
		for(int i=0; i<=strArr.length-1; i++) {
			
			
			
			
			if(strArr[i]=='a' ||strArr[i]=='e' || strArr[i]=='i' ||strArr[i]=='o' ||strArr[i]=='u') {
				countVowel++;
			}
			else {
				cons++;
			}
		}
		
		System.out.println("vowel is "+countVowel);
		System.out.println("consonent is "+ cons);
	}

}

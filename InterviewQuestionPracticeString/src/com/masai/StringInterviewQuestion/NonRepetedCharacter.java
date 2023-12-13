package com.masai.StringInterviewQuestion;

public class NonRepetedCharacter {
	
	/*
	 * we find first non repeted element in this string
	 * 
	 * sample input: "AABCDBE";
	 * sample output: c
	 */
	
	public static void main(String[] args) {
		String str="AABCDBE";
		
		char[] strArr= str.toCharArray();
		
		for(int i=0; i<strArr.length; i++) {
			boolean flag= true;
			
			for(int j=0; j<strArr.length; j++) {
				if(i!=j && strArr[i]==strArr[j]) {
					flag=false;
				}
			}
			
			if(flag) {
				System.out.println(strArr[i]);
				break;
			}
		}
	}

}

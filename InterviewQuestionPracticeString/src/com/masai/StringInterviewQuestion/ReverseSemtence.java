package com.masai.StringInterviewQuestion;

public class ReverseSemtence {
	/*
	 * sample input: "java code"
	 * sample output: avaj edoc
	 */

	public static void main(String[] args) {
		String str= "java code";
		
		String[] strArr=str.split(" ");
		
		//char[] strArr= str.toCharArray();
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<strArr.length; i++) {
			char[] charArr=strArr[i].toCharArray();
			
		
			
			for(int j=charArr.length-1; j>=0; j--) {
				sb.append(charArr[j]);
			}
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
}

package com.masai.StringInterviewQuestion;

public class CharWithOccurance {
	
	/*
	 * sample input: "opentext"
	 * sample output: open1ex2
	 */
	
	public static void main(String[] args) {
		String str="opentext";
		char[] strArr=str.toCharArray();
		char tar='t';
		
		StringBuilder sb= new StringBuilder();
		
		int count=1;
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]==tar) {
				sb.append(count);
				count++;
			}
			else {
				sb.append(strArr[i]);
			}
		}
		
		System.out.println(sb.toString().equals(str));
	}

}

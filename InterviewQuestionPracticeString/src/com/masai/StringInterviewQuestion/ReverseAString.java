package com.masai.StringInterviewQuestion;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello";
		
		
		char[] strArr= str.toCharArray();
		
		//approach-1
		
		for(int i=strArr.length-1; i>=0; i--) {
			System.out.print(strArr[i]);
		}
		
		
		System.out.println();
		//approach-2

		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		// approach -3
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
	}

}

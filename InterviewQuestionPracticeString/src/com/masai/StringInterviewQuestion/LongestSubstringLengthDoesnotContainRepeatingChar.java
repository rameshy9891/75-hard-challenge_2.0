package com.masai.StringInterviewQuestion;

public class LongestSubstringLengthDoesnotContainRepeatingChar {
	
	/*
	 * sample input: abbac
	 * sample output: bac  --> length is 3
	 * 
	 * sample input: abcabcbb
	 * sample output: abc  --> length is 3
	 */
	
	public static void main(String[] args) {
		String str="abbac";
		String res="";
		char[] strArr=str.toCharArray();
		int max=0;
		for(int i=0; i<strArr.length; i++) {
			StringBuilder sb= new StringBuilder();
			
			for(int j=i; j<strArr.length; j++) {
				sb.append(strArr[j]);
				
				
			if(	find(sb.toString().toCharArray())&& max<sb.length()){
					max=sb.length();
					res=sb.toString();
				}
			}
		}
		
		System.out.println(max);
		System.out.println(res);
	}

	private static boolean find(char[] charArray) {
		// TODO Auto-generated method stub
		 for (int i = 0; i < charArray.length; i++) {
	            int count = 0;
	            for (int j = 0; j < charArray.length; j++) {
	                if (i != j && charArray[i] == charArray[j]) {
	                    count++;
	                }
	            }
	            if (count > 0) {
	                return false;
	            }
	        }
	        return true;
	    }

}

package com.masai.StringInterviewQuestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetedCharacterUsingMap {
	

	/*
	 * we find first non repeted element in this string
	 * 
	 * sample input: "AABCDBE";
	 * sample output: c
	 */
	
	public static void main(String[] args) {
		String str="AABCDBE";
		
		char[] strArr= str.toCharArray();
		
		Map<Character,Integer> hm= new LinkedHashMap<>();
		
		for(int i=0; i<strArr.length; i++) {
			
			if(hm.containsKey(strArr[i])) {
				hm.put(strArr[i], hm.get(strArr[i])+1);
			}
			else {
				hm.put(strArr[i], 1);
			}
			
		}
		
		System.out.println(hm);
		
		for(Map.Entry<Character,Integer> em: hm.entrySet()) {
			if(em.getValue()==1) {
				System.out.println(em.getKey());
				break;
			}
		}
	}

}

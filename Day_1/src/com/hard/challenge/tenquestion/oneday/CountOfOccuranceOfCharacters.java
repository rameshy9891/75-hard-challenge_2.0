package com.hard.challenge.tenquestion.oneday;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccuranceOfCharacters {
	
	/*
	 * the number of occurence of each charcter in the string using hash map
	 * 
	 * java is 
	 * j 1
	 * a 2
	 * v 1
	 * ' ' 1
	 * i 1
	 * s 1
	 * 
	 * key = charcter value = it's occuraace count
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "java";
		char[] strArr=string.toCharArray();
		HashMap<Character,Integer> hasmap= new HashMap<Character,Integer>();
		
		for(int i=0; i<strArr.length; i++) {
			
			if(hasmap.containsKey(strArr[i])) {
				hasmap.put(strArr[i], hasmap.get(strArr[i])+1);
			}
			else {
				hasmap.put(strArr[i], 1);
			}
		}
		
		//System.out.println(hasmap);
		
		int maxCount=0;
		char maxChar=' ';
		
		for(Map.Entry<Character, Integer> me : hasmap.entrySet()) {
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
			if(maxCount < me.getValue()) {
				maxCount=me.getValue();
				maxChar=me.getKey();
			}
		
		}
		
		System.out.println("maximum repeted number "+ maxCount);
	}

}

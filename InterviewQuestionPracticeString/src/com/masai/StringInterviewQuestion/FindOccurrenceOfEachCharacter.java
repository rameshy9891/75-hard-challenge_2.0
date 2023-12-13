package com.masai.StringInterviewQuestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindOccurrenceOfEachCharacter {
	
	/*
	 * sample input: hello
	 * sample output: h-1 e-1 l-2 o-1
	 * 
	 */
	public static void main(String[] args) {
		
		String str="hello";
		
		char[] strArr=str.toCharArray();
		
	  Map<Character,Integer> hasMap= new LinkedHashMap<>();
	  
	  for(int i=0; i<strArr.length; i++) {
		  if(hasMap.containsKey(strArr[i])) {
			  hasMap.put(strArr[i], hasMap.get(strArr[i])+1);
		  }
		  else {
			  hasMap.put(strArr[i],1);
		  }
	  }
	  
	 // System.out.println(hasMap);
	  
	  for(Map.Entry<Character, Integer> em: hasMap.entrySet()) {
		  
		  System.out.print(em.getKey()+"-"+em.getValue()+"  ");
	  }
	}

}

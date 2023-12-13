package com.masai.StringInterviewQuestion;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatCharcter {
	
	/*
	 * sample input: programming
	 * sample output: poraming
	 */
	
	public static void main(String[] args) {
		String str="programming";
		
		//aproach -1
		StringBuilder sb= new StringBuilder();
		
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
		//aprocah -2
		StringBuilder sb1= new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			
			int idx= str.indexOf(ch,i+1);
			
			if(idx==-1) {
				sb1.append(ch);
			}
		}
		
		System.out.println(sb1);
		
		
	  StringBuilder sb2= new StringBuilder();
	  
	 char[] strArr= str.toCharArray();
	 

	 Set<Character> set= new LinkedHashSet<>();
	 
	 for(int i=0; i<strArr.length; i++) {
		 set.add(strArr[i]);
	 }
	 
	 for(Character ch:set) {
		 System.out.print(ch);
	 }
	 
	 
	}

}

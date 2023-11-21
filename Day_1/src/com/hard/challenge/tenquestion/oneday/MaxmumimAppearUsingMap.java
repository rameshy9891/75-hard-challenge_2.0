package com.hard.challenge.tenquestion.oneday;

import java.util.HashMap;
import java.util.Map;

public class MaxmumimAppearUsingMap {
	
	
	
	public static void main(String[] args) {
		
		String s="abbccc";
		
		char[] strArr=s.toCharArray();
		
		Map<Character,Integer> hm= new HashMap<>();
		
		for(char ch:strArr) {
			
			if(hm.containsKey(ch)) {
				
			
			hm.put(ch, hm.get(ch)+1);
			}
			
			else {
				hm.put(ch, 1);
			}
		}
		int max=0;
		char maxchar=' ';
		for(Map.Entry<Character,Integer> me: hm.entrySet()) {
		//	System.out.println(me.getKey()+"**"+me.getValue());
			
			if(max<me.getValue()) {
				max=me.getValue();
				maxchar=me.getKey();
				
			}
		}
		
		System.out.println(max+" "+maxchar);
	}

}

package com.hard.challenge.tenquestion.oneday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefrenceExample {
	
	public static void main(String[] args) {
		
		
		List<String> list= Arrays.asList("rahul","anuj","ramesh","maynka","anshuman");
		
	List<String> name=	list.stream().filter(n->n.length()>5).filter(n->n.startsWith("a")|| n.startsWith("A")).collect(Collectors.toList());
	System.out.println(name);
	
	System.out.println();
	
	List<Integer> numberList= Arrays.asList(5,5,10,15,20,25,30,35,40,23);
	
	numberList.stream().distinct().map(i->i*2).forEach(System.out::println);
	
	
	
	
		
	}

}

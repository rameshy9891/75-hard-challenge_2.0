package com.hard.challenge.tenquestion.oneday;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ZzzzStreamApiUse {
	
	public static void main(String[] args) {
		
		List<Integer> intList= Arrays.asList(10,20,30);
		
		intList.stream().forEach(i->System.out.print(i+i+" "));
		System.out.println();
		
		//System.out.println(intList);
		
		System.out.println(intList.stream().filter(i->i*i==100).collect(Collectors.toSet()));
		
		Integer stream=intList.stream().reduce(0, (i1,i2)->i1+i2);
		
		System.out.println(stream);
		
		System.out.println(intList.stream().reduce(1, (i,j)-> i*j));
		
		System.out.println(intList.stream().collect(Collectors.reducing(0, (n1,n2)->n1+n2)));
		
		Optional<Integer> max=	intList.stream().collect(Collectors.maxBy(Integer::compare));
		
		
		
		
		System.out.println(max.get());
		
		
		List<String> nameList= Arrays.asList("ramesh" , "rahul","raj","ram","rohit","raja");
		
		nameList.stream().forEach(i->System.out.print(i.length()+" "));
		
		nameList.stream().map(i->i.length()).collect(Collectors.toList());
		
	}
}

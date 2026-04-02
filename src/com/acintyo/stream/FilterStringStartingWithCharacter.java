package com.acintyo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringStartingWithCharacter {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","Ravi","Amit","Rahul");
		
		list.stream().filter(name-> name.startsWith("R")).forEach(System.out::println);
		
//		List<String> collect = list.stream().filter(name-> name.startsWith("R")).collect(Collectors.toList());
//		System.out.println(collect);
		
	}
}

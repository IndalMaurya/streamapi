package com.acintyo.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream2 {
	public static void main(String[] args) {
		
		String input = "aabbcdeff";
//
//		Character result = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
//		System.out.println(result);
		
//		 List<Integer> list = Arrays.asList(1,2,3,2,4,1,5);
//		 list.stream().filter(n-> Collections.frequency(list, n)>1).collect(Collectors.toSet()).forEach(System.out::println);

//		 List<Integer> salaries = Arrays.asList(50000, 70000, 60000, 90000);
//		 Integer second = salaries.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(null);
//		 System.out.println(second);
		 
//		 LinkedHashMap<Character,Long> collect = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
//		 System.out.println(collect);
		
//		List<Integer> list1 = Arrays.asList(1,2,3);
//        List<Integer> list2 = Arrays.asList(2,3,4);
        
//        list1.stream().filter(list2::contains).collect(Collectors.toList()).forEach(System.out::println);
	
		
		
	}
}

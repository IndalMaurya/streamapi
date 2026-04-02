package com.acintyo.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 5, 1, 2, 1, 2, 4, 3);
		
		/*Integer firstNonRepeating = numbers.stream().collect(Collectors.groupingBy(
				Function.identity(),
				LinkedHashMap::new,
				Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		 System.out.println("First Non-Repeating: " + firstNonRepeating);*/
		 
		
	}
}

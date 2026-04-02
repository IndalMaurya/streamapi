package com.acintyo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElements {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 15, 20, 10, 25, 20, 30);
		 
		 Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()));
		 System.out.println("Frequency Map: "+frequencyMap);
	}
}

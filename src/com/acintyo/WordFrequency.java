package com.acintyo;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		/*Map<String, Integer> frequencyMap = new HashMap<>();
		
		for (String word : words) {
		    frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}
		
		System.out.println(frequencyMap);*/

		Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(collect);

	}
}

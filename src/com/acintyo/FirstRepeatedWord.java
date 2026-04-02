package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedWord {
	public static void main(String[] args) {
		String sentence = "this is a test this is only a test";
		
		String[] words = sentence.split("\\s+");
		
		Map<String, Integer> map = new HashMap<>();
		for (String str : words) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		
			if (map.get(str) > 1) {
				System.out.println("First repeated word : " + str);
				return;
			}
		}
		System.out.println("No repeated word found");
		
		
		
	}
}

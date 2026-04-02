package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "aabbcdehht";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		System.out.println(map.toString());
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
				break;
			}
		}
		System.out.println("--------------------");
		map.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(k -> System.out.println(k.getKey() + "=" + k.getValue()));
	}
}

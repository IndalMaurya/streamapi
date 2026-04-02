package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter2 {
	public static void main(String[] args) {
		String str = "aabbcdehht";
		Map<Character, Integer> map =new HashMap<>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}
		System.out.println("--------------------");
		
		map.entrySet().stream().filter(ch -> ch.getValue()>1)
		.forEach(System.out::println);
		
	}
}

package com.acintyo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top3Words {
	public static void main(String[] args) {
		/*List<String> words = Arrays.asList("java", "spring", "java", "react", "java", "spring", "angular");
		
		Map<String, Long> freqMap = words.stream()
		        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		
		List<Map.Entry<String, Long>> top3 = freqMap.entrySet()
		        .stream()
		        .sorted((a, b) -> Long.compare(b.getValue(), a.getValue())) // sort by count desc
		        .limit(3)
		        .toList();
		
		System.out.println(top3);*/
		
		List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        Map<String, List<String>> map = new HashMap<>();

        for(String str : words) {
        	char[] charArray = str.toCharArray();
        	Arrays.sort(charArray);
        	String key = new String(charArray);
        	map.computeIfAbsent(key, k-> new ArrayList<>()).add(str);
        	
        }
        System.out.println(new ArrayList<>(map.values()));
	}
}

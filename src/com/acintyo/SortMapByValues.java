package com.acintyo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValues {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 5);
		map.put("cherry", 8);
		map.put("banana", 2);

		List<Map.Entry<String, Integer>> arrayList = new ArrayList<>(map.entrySet());
		
		arrayList.sort(Map.Entry.comparingByKey());
		
		System.out.println(arrayList);
	}
}

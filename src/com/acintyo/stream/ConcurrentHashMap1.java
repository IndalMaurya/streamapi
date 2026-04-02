package com.acintyo.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "Indal");
		System.out.println(map.get("d"));
		
		ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
		hashMap.put(1, "Indal");
		hashMap.put(2, "Rahul");
		System.out.println(hashMap);
	
	}
}

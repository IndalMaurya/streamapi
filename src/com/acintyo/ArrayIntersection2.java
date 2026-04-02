package com.acintyo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayIntersection2 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 4 };
		int[] arr2 = { 2, 2, 3, 5 };
		
		Map<Integer, Integer>map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int num : arr1) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(int num : arr2) {
			if(map.containsKey(num) && map.get(num)>0) {
				list.add(num);
				map.put(num, map.get(num)-1);
			}
		}
		System.out.println(list);
	}
}

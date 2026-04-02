package com.acintyo;

import java.util.*;

public class ArrayIntersection {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 4 };
		int[] arr2 = { 2, 2, 3, 5 };

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		// Store frequencies of elements from arr1
		for (int num : arr1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		// Check elements from arr2
		for (int num : arr2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				result.add(num); // common element
				map.put(num, map.get(num) - 1); // reduce frequency
			}
		}

		System.out.println("Intersection: " + result);
	}
}

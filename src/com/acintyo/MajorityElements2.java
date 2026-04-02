package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements2 {
	public static void main(String[] args) {
		int[] arr = { 3, 3, 4, 2, 3, 3, 3, 4 };
		int n = arr.length / 2;
		boolean flg = false;
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		// map.entrySet().stream().filter(entry
		// ->entry.getValue()>n).forEach(System.out::println);

		/*for(int num : map.keySet()) {
		 if(map.get(num)>n) {
			 System.out.println("Majority Element: " + num + " = " + map.get(num));
			 flg=true;
		 }
		}
		if(!flg) {
		 System.out.println("No Majority Element found");
		}*/

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n) {
				System.out.println("Majority Element: " + entry.getKey() + " = " + entry.getValue());
				flg = true;
			}
		}
		if (!flg) {
			System.out.println("No Majority Element found");
		}
	}
}

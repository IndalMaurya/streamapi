package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent")); // true
		System.out.println(isAnagram("hello", "world")); // false
	}

	private static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : str2.toCharArray()) {
			if (!map.containsKey(ch)) {
				return false;
			}
			map.put(ch, map.get(ch) - 1);
			if (map.get(ch) == 0) {
				map.remove(ch);
			}
		}
		return map.isEmpty();

	}

	/*private static boolean isAnagram(String str1, String str2) {
	
		if (str1.length() != str2.length()) {
			return false;
		}
	
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
	
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	
		return Arrays.equals(arr1, arr2);
	}*/

}

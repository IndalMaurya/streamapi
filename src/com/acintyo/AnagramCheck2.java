package com.acintyo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck2 {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent")); // true
		System.out.println(isAnagram("hello", "world")); // false
	}

	private static boolean isAnagram(String str1, String str2) {

		char[] charArray = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		return Arrays.equals(charArray, charArray2);

	}

	/*private static boolean isAnagram(String str1, String str2) {
	    if (str1 == null || str2 == null) {
	        return str1 == str2;
	    }
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
	        if (map.get(ch) < 0) {
	            return false;
	        }
	    }
	
	    return true;
	}*/

}

package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "swwaiiss";
		boolean flg = false;
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeating character: " + entry.getKey());
				flg = true;
				return;
			}
		}
		if (!flg) {
			System.out.println("no character is repeating");

		}
	}

}

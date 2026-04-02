package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	public static void main(String[] args) {
		String str = "hello world";

		// Create HashMap to store character frequencies
		Map<Character, Integer> freqMap = new HashMap<>();

		// Convert string to char array and count
		for (char ch : str.toCharArray()) {
			if (ch != ' ') { // ignore spaces (optional)
				freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
			}
		}

		// Print frequency of each character
		System.out.println("Character Frequencies:");
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}
}

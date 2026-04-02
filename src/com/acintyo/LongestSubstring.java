package com.acintyo;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abcabcbb";
		System.out
				.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(str));
	}

	private static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0, right = 0, maxLength = 0;

		while (right < s.length()) {
			char ch = s.charAt(right);
			while (set.contains(ch)) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(ch);
			maxLength = Math.max(maxLength, right - left + 1);
			right++;
		}
		return maxLength;
	}
}

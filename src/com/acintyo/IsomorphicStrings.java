package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
		if (s == null || t == null)
			return s == t;
		if (s.length() != t.length())
			return false;

		Map<Character, Character> mapST = new HashMap<>();
		Map<Character, Character> mapTS = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);

			// check s -> t mapping
			if (mapST.containsKey(cs)) {
				if (mapST.get(cs) != ct)
					return false;
			} else {
				mapST.put(cs, ct);
			}

			// check t -> s mapping (to ensure injective)
			if (mapTS.containsKey(ct)) {
				if (mapTS.get(ct) != cs)
					return false;
			} else {
				mapTS.put(ct, cs);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add")); // true
		System.out.println(isIsomorphic("foo", "bar")); // false
		System.out.println(isIsomorphic("paper", "title")); // true
		System.out.println(isIsomorphic("ab", "aa")); // false
	}
}

package com.acintyo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("pear");
		list.add("apple");
		list.add("banana");
		list.add("kiwi");
		list.add("fig");
		list.add("grape");

		Collections.sort(list, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		System.out.println(list);
	}
}

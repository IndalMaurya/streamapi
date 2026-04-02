package com.acintyo.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 10, 25, 20, 30);

		Set<Integer> set = new HashSet<>();
		
		Set<Integer> duplicate = numbers.stream().filter(n-> !set.add(n)).collect(Collectors.toSet());
		System.out.println(duplicate);
	}
}

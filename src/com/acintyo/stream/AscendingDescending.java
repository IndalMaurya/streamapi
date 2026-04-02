package com.acintyo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscendingDescending {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 67, 20, 89, 25, 30, 35);

		//Ascending
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println("------------------");
		//Descending
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}

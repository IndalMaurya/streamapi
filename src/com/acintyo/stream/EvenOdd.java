package com.acintyo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
//		numbers.stream().filter(n-> n%2==0).forEach(System.out::println);
		List<Integer> collect = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println(collect);
	}
}

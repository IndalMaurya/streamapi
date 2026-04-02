package com.acintyo.stream;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);
		
		Integer max = numbers.stream().max(Integer::compare).get();
		Integer min = numbers.stream().min(Integer::compare).get();
		
		System.out.println(max+", "+min);
		
	}
}

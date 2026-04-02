package com.acintyo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3Largest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 20,20, 8, 25, 3, 25);
		
		/*numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		List<Integer> top3 = numbers.subList(0, Math.min(3, numbers.size()));
		 System.out.println("Top 3 largest: " + top3);
		 
		 List<Integer> list = numbers.stream().distinct()
				 .sorted(Comparator.reverseOrder()).limit(3).toList();
		 System.out.println("Top 3 largest: " + list);*/
		
		numbers.sort(Comparator.reverseOrder());
		System.out.println(numbers);
		
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(3)
		.forEach(System.out::println);
		
	}
}

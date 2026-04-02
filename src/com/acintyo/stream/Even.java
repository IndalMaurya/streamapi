package com.acintyo.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Even {
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(10, 15, 20, 33, 40, 55);
//		
//		numbers.stream().filter(num -> num%2==0).forEach(System.out::println);

		/*	List<Integer> numbers = Arrays.asList(10, 15, 23, 11, 45, 18);
		
		List<Integer> collect = numbers.stream().map(String::valueOf)
		.filter(n -> n.startsWith("1"))
		.map(Integer::valueOf).collect(Collectors.toList());
		
		System.out.println(collect);
		int a = 404;
		String string = String.valueOf(a);
		System.out.println(string.length());
		Integer valueOf = Integer.valueOf(string);
		System.out.println(valueOf);*/

		// List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,3,6);
		/*	Set<Integer> collect = numbers.stream().filter(n-> Collections.frequency(numbers, n)>1).collect(Collectors.toSet());
		System.out.println(collect);
		
		numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
		.forEach(System.out::print);*/

//		Set<Integer> set = new HashSet<>();
//		numbers.stream().filter(n-> !set.add(n)).forEach(System.out::print);

//		List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 3, 15);
//		numbers.stream().findFirst().ifPresent(System.out::println);
//		long count = numbers.stream().count();
//		System.out.println(count);

//		List<Integer> numbers = List.of(10, 25, 5, 40, 30, 25);

//		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
//		System.out.println(max.get());

//		List<Integer> list = numbers.stream().sorted().toList();
//		System.out.println(list);

//		List<Integer> list = numbers.stream().sorted(Comparator.reverseOrder()).toList();
//		System.out.println(list);

//		Integer integer = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
//		System.out.println(integer);

//		List<Integer> numbers = List.of(10, 25, 5, 40, 30, 25, 5);

//		List<String> names = List.of("indal", "rahul", "amit", "sachin", "rohit");

//		Integer integer = numbers.stream().distinct().sorted().skip(1).findFirst().get();
//		System.out.println(integer);
//		
//		List<String> list = names.stream().map(String::toUpperCase).toList();
//		System.out.println(list);

//		String string = names.stream().max(Comparator.comparing(String::length)).get();
//		System.out.println(string);

//		Map<Integer,Long> collect = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//		System.out.println(collect);
//		
//		List<Entry<Integer, Long>> list = numbers.stream().collect(Collectors.groupingBy(n-> n, Collectors.counting())).entrySet().stream().filter(n-> n.getValue()>1).toList();
//		
//		System.out.println(list);

//		List<Integer> numbers = List.of(10, 40, 20, 60, 30, 50);
//		
//		List<Integer> list = numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).toList();
//		System.out.println(list);
//		
//		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);

//		List<Employee1> employees = List.of(
//				new Employee1("Indal", "IT", 60000), 
//				new Employee1("Rahul", "HR", 50000),
//				new Employee1("Amit", "IT", 70000), 
//				new Employee1("Rohit", "Sales", 55000)
//				);

//		Map<String,List<Employee1>> collect = employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
//		System.out.println(collect);
		
//		Employee1 highestSalaryEmp = employees.stream().max(Comparator.comparing(Employee1::getSalary)).get();
//		System.out.println(highestSalaryEmp.getName());
		
//		Employee1 secondHighest = employees.stream().distinct().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst().get();
//		System.out.println(secondHighest.getName());
	
//		List<Employee2> employees = List.of(
//		        new Employee2(1, "Amit", "IT", 70000),
//		        new Employee2(2, "Rahul", "HR", 45000),
//		        new Employee2(3, "Ankit", "IT", 60000),
//		        new Employee2(4, "Rohit", "Sales", 50000),
//		        new Employee2(5, "Ajay", "HR", 55000)
//		);
		
//		double asDouble1 = employees.stream().mapToDouble(Employee2::getSalary).average().getAsDouble();
//		System.out.println(asDouble1);
		
//		Map<Boolean,List<String>> collect = employees.stream().collect(Collectors.partitioningBy(e -> e.getSalary()>50000,
//				Collectors.mapping(Employee2::getName, Collectors.toList())));
//		collect.forEach((key, value)->System.out.println(key+"->"+value));

//		Map<Integer,String> collect = employees.stream().collect(Collectors.toMap(Employee2::getId, Employee2::getName));
//		System.out.println(collect);
	
//		Map<String,Long> collect = employees.stream().collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.counting()));
//		System.out.println(collect);
		
//		List<Employee2> list = employees.stream().filter(e -> e.getName().startsWith("A")).toList();
//		list.forEach(e-> System.out.println(e.getName()));
		
//		List<String> words = List.of("java", "spring");
//		List<Character> list = words.stream().flatMap(word -> word.chars().mapToObj(c ->(char)c)).distinct().toList();
//		System.out.println(list);
		
		List<List<Integer>> numbers = List.of(
		        List.of(1, 2),
		        List.of(3, 4),
		        List.of(5, 6)
		);
		
		numbers.stream().flatMap(List::stream).toList();
		
	}
}

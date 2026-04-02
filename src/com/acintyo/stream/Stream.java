package com.acintyo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
//		 numbers.stream().filter(n-> n%2==0).forEach(System.out::println);

//		List<Integer> numbers = Arrays.asList(10, 15, 23, 19, 45, 12);
//        numbers.stream().filter(n -> String.valueOf(n).startsWith("1")).forEach(System.out::println);
//		List<Integer> collect = numbers.stream().map(n -> n.toString()).filter(n -> n.startsWith("1"))
//				.map(Integer::valueOf).collect(Collectors.toList());
//		System.out.println(collect);
		
//		Set<Integer> set = new HashSet<>();
//		List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10);
//	//	numbers.stream().filter(n-> !set.add(n)).forEach(System.out::println);
//		numbers.stream().collect(Collectors.groupingBy(n-> n, Collectors.counting()))
//		.entrySet().stream().filter(n-> n.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
//		Integer integer = numbers.stream().findFirst().get();
//	//	System.out.println(integer);
//		
//		Long count = numbers.stream().count();
		//System.out.println(count);
		
//		List<Integer> numbers = Arrays.asList(35,10, 25, 5, 40, 30, 15);
//		Integer max = numbers.stream().max(Integer::compare).get();
//		System.out.println(max);
	  
//		numbers.stream().sorted().forEach(System.out::println);
//		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		Integer secondHighest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(secondHighest);
//		Integer n = numbers.stream().sorted().skip(1).findFirst().get();
//		System.out.println(n);
		
//		List<String> names = List.of("indal", "rahul", "amit", "sachin", "rohit");
//		names.stream().map(String::toUpperCase).forEach(System.out::println);
//		String maxLength = names.stream().max(Comparator.comparing(String::length)).get();
//		System.out.println(maxLength);
		
//		List<Integer> numbers = List.of(10, 25, 5, 40, 30, 25, 5);
//		Map<Integer,Long> collect = numbers.stream().collect(Collectors.groupingBy(n-> n, Collectors.counting()));
//		System.out.println(collect);
//		
//		List<Entry<Integer, Long>> list = numbers.stream().collect(Collectors.groupingBy(n-> n, Collectors.counting()))
//		.entrySet().stream().filter(num -> num.getValue()>1).toList();
//		System.out.println(list);
		
//		List<Integer> numbers = List.of(10, 40, 20, 60, 30, 50);
//		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
//		
//		List<Employee1> employees = List.of(
//				new Employee1("Indal", "IT", 60000), 
//				new Employee1("Rahul", "HR", 50000),
//				new Employee1("Amit", "IT", 70000), 
//				new Employee1("Rohit", "Sales", 55000)
//				);
		
//		Map<String,List<Employee1>> collect = employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
//		collect.forEach((key, value)-> System.out.println(key+"->"+value));
		
//	    employees.stream().max(Comparator.comparing(Employee1::getSalary)).ifPresent(System.out::println);
//		Employee1 employee1 = employees.stream().distinct().sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst().get();
//		System.out.println(employee1);
		
//		double average = employees.stream().mapToDouble(Employee1::getSalary).average().getAsDouble();
//		System.out.println(average);
		
//		List<Employee2> employees = List.of(
//		        new Employee2(1, "Rohit", "IT", 70000),
//		        new Employee2(2, "Rahul", "HR", 45000),
//		        new Employee2(3, "Ankit", "IT", 60000),
//		        new Employee2(4, "Amit", "Sales", 50000),
//		        new Employee2(5, "Ajay", "HR", 55000)
//		);
		
//		Map<Boolean,List<String>> collect = employees.stream().collect(Collectors.partitioningBy(p -> p.getSalary()>50000, Collectors.mapping(Employee2::getName, Collectors.toList())));
//		System.out.println(collect);
//		collect.forEach((key, value)->System.out.println(key+"->"+value));
		
//		Map<Integer,String> collect = employees.stream().collect(Collectors.toMap(Employee2::getId, Employee2::getName));
//		System.out.println(collect);
		
//		 Map<String,Long> collect = employees.stream().collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.counting()));
//		 System.out.println(collect);
		
//		 List<Employee2> list = employees.stream().filter(emp -> emp.getName().startsWith("A")).toList();
//		 list.forEach(System.out::println);
		 
//		 employees.stream().filter(emp -> emp.getSalary()>50000).sorted(Comparator.comparing(Employee2::getName)).forEach(System.out::println);
	
//		Map<String,List<Employee2>> collect = employees.stream().collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.toList()));
//		collect.forEach((key, value)-> System.out.println(key+"->"+value));
//		
//		List<Employee3> employees = List.of(
//			    new Employee3("Rahul", "IT", 30, 60000),
//			    new Employee3("Abhay", "IT", 30, 60000),
//			    new Employee3("Amit", "HR", 28, 45000),
//			    new Employee3("Neha", "IT", 26, 70000),
//			    new Employee3("Suresh", "Finance", 35, 55000)
//			);
	
//		String department = employees.stream().collect(Collectors.groupingBy(Employee3::getDepartment, Collectors.counting()))
//				.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//		System.out.println(department);
		
//		String department = employees.stream().collect(Collectors.groupingBy(Employee3::getDepartment, Collectors.counting()))
//		.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//		System.out.println(department);
		
//		Employee3 emp = employees.stream().min(Comparator.comparing(Employee3::getAge)).orElse(null);
//		System.out.println(emp);
//		Employee3 emp1 = employees.stream().max(Comparator.comparing(Employee3::getAge)).orElse(null);		
//		System.out.println(emp1);
		
//		List<String> names = List.of("Rahul", "Amit", "Neha");
//		String collect = names.stream().collect(Collectors.joining(","));
//		System.out.println(collect);
		
//		List<String> words = List.of("java", "spring");
//		List<Character> list = words.stream().flatMap(word-> word.chars().mapToObj(c->(char)c).distinct()).toList();
//		System.out.println(list);
		
		List<List<Integer>> numbers = List.of(
		        List.of(1, 2),
		        List.of(3, 4),
		        List.of(5, 6)
		);
		List<Integer> list = numbers.stream().flatMap(List::stream).toList();
		System.out.println(list);
		
	}
}

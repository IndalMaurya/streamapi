package com.acintyo.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
//		List<Integer> numbers = List.of(10, 40, 20, 60, 30, 50);
//		// Find top 3 highest numbers.
//		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
//
//		// Find sum of all numbers.
//		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);

//		Group employees by department using Streams.
//		List<Employee1> employees = List.of(new Employee1("Indal", "IT", 60000), new Employee1("Rahul", "HR", 50000),
//				new Employee1("Amit", "IT", 70000), new Employee1("Rohit", "Sales", 55000));
//		Map<String,List<Employee1>> collect = employees.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
//		collect.forEach((key, value)-> System.out.println(key+"->"+value));

//		Find highest salary employee.
//		employees.stream().max(Comparator.comparing(Employee1::getSalary)).ifPresent(System.out::println);

//		Find second highest salary employee.
//		Employee1 employee1 = employees.stream().distinct()
//				.sorted(Comparator.comparing(Employee1::getSalary).reversed()).skip(1).findFirst().get();
//		System.out.println(employee1);

//      Find average salary of employees.	
//		double average = employees.stream().mapToDouble(Employee1::getSalary).average().getAsDouble();
//		System.out.println(average);

		List<Employee2> employees = List.of(new Employee2(1, "Rohit", "IT", 70000),
				new Employee2(2, "Rahul", "HR", 45000), new Employee2(3, "Ankit", "IT", 60000),
				new Employee2(4, "Amit", "Sales", 50000), new Employee2(5, "Ajay", "HR", 55000));
//		Partition employees based on salary > 50000.		
//		Map<Boolean,List<String>> collect = employees.stream().collect(Collectors.partitioningBy(p-> p.getSalary()>50000, Collectors.mapping(Employee2::getName, Collectors.toList())));
		// System.out.println(collect);
//		collect.forEach((key, value)->System.out.println(key+"->"+value));

//		Convert List<Employee> → Map<Id, Name>.
//		Map<Integer, String> collect = employees.stream()
//				.collect(Collectors.toMap(Employee2::getId, Employee2::getName));
//		System.out.println(collect);

//      Count employees in each department.		
//		Map<String,Long> collect = employees.stream().collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.counting()));
//		System.out.println(collect);
	
//		Find employees whose name starts with "A".
		List<Employee2> list = employees.stream().filter(emp -> emp.getName().startsWith("A")).toList();
		list.forEach(System.out::println);
	}
}

package com.acintyo.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Employee3 {
	private String name;
	private String department;
	private int age;
	private double salary;

	@Override
	public String toString() {
		return "Employee3 [name=" + name + ", department=" + department + ", age=" + age + ", salary=" + salary + "]";
	}

	public Employee3(String name, String department, int age, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
  
	public static void main(String[] args) {
		List<Employee3> employees = List.of(
			    new Employee3("Rahul", "IT", 30, 60000),
			    new Employee3("Abhay", "IT", 30, 60000),
			    new Employee3("Amit", "HR", 28, 45000),
			    new Employee3("Neha", "IT", 26, 70000),
			    new Employee3("Suresh", "Finance", 35, 55000)
			);
		
//		List<Employee3> list = employees.stream().filter(emp -> emp.getSalary()>50000).sorted(Comparator.comparing(Employee3::getName)).toList();
//		list.forEach(System.out::println);
	
//		String department = employees.stream().collect(Collectors.groupingBy(Employee3::getDepartment, Collectors.counting()))
//		.entrySet().stream().max(Map.Entry.comparingByValue())
//		.get().getKey();
//		
//		System.out.println(department);
		
//		Employee3 youngest = employees.stream().min(Comparator.comparing(Employee3::getAge)).orElse(null);
//		System.out.println(youngest);
		
//		Employee3 oldest = employees.stream().max(Comparator.comparing(Employee3::getAge)).orElse(null);
//		System.out.println(oldest);
		
		List<String> names = List.of("Rahul", "Amit", "Neha");
		String result = names.stream().collect(Collectors.joining(","));
		System.out.println(result);
	}
	
}

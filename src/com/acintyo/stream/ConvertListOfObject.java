package com.acintyo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
    
}*/

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
    
}

public class ConvertListOfObject {
	public static void main(String[] args) {
		/*List<Employee> employees = Arrays.asList(new Employee(1,"Ram",20000, "HR"),
				      new Employee(2, "Shyam", 30000, "IT"),
				      new Employee(3, "Rahul", 40000, "HR"),
				      new Employee(4, "Rakesh", 40000, "IT"),
				      new Employee(5, "Abhay", 40000, "Finance"));
		
		//employees.stream().map(Employee::getName).toList().forEach(System.out::println);
		
		Map<String,List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(collect);*/
		
		List<Employee> employees = Arrays.asList(new Employee("Akash", 125000),
				new Employee("Rahul", 35000),new Employee("Rajesh", 445000));
		
		Optional<Employee> highestSalary = employees.stream().max(Comparator.comparing(Employee::getSalary));
		
		highestSalary.ifPresent(System.out::println);
		
	}
}

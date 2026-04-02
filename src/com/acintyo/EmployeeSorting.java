package com.acintyo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + " (" + salary + ")";
	}
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		int salaryCompare = Double.compare(e1.getSalary(), e2.getSalary());
		if(salaryCompare == 0) {
			return e1.getName().compareTo(e2.getName());
		}
		return salaryCompare;
	}
	
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 50000));
        employees.add(new Employee("Charlie", 70000));
        employees.add(new Employee("David", 60000));

        // Sort using custom comparator
        //Collections.sort(employees, new EmployeeComparator());
        
        employees.sort(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));

        System.out.println("Sorted Employees: " + employees);
    }
}

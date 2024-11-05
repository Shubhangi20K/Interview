package com.multi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortEmployeeExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", 50000));
		employees.add(new Employee("Jane", 60000));
		employees.add(new Employee("Jack", 40000));

		// Sort by name in ascending order
		List<Employee> sortedByNameAsc = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println("Sorted by Name (Ascending):");
		sortedByNameAsc.forEach(System.out::println);
		// second hightest salary

		List<Employee> employee =employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).limit(1).collect(Collectors.toList());
		System.out.println(employee);


		Optional<Employee> e1 = employees.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee :: getSalary)));
		System.out.println(e1);
	}
}
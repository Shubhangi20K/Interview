package com.nt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmplyeeMain {

	public static void main(String[] args) {

		Employee emp = new Employee(1, 10000, "shubhangi", "it" ,"Female");
		Employee emp1 = new Employee(2, 20000, "bhpendar", "s/w","Male");
		Employee emp2 = new Employee(3, 30000, "surbhi", "cs","Femail");
		Employee emp3 = new Employee(4, 50000, "pushpender", "cs","Femail");
		Employee emp5 = new Employee(5, 40000, "sunil", "ec","Male");
		List<Employee> l1 = new ArrayList<>();
		l1.add(emp);
		l1.add(emp1);
		l1.add(emp2);
		l1.add(emp3);
		l1.add(emp5);
		System.out.println(l1);

		/*
		 * List<Employee> l2 = l1.stream().filter(x ->
		 * x.getName().startsWith("b")).collect(Collectors.toList());
		 * System.out.println(l2);
		 * 
		 * Map<String, List<Employee>>
		 * map=l1.stream().collect(Collectors.groupingBy(x->x.getDepartment(),Collectors
		 * .toList())); System.out.println(map);
		 * 
		 * Double d1=l1.stream().mapToDouble(x->x.getSalary()).sum();
		 * System.out.println(d1);
		 */

		Map<Object, Long> k=l1.stream().collect(Collectors.groupingBy(x-> x.getGender(),Collectors.counting()));
		System.out.println(k);
	}

}

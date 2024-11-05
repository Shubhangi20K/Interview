package com.assesments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mainsss {
public static void main(String[] args) {
	
   List <Employee> emp = new ArrayList<>(); 
	
emp.add(new Employee(101 ,"sk",88000000.0));
emp.add(new Employee(102 ,"sk",9000000000000.0));
emp.add(new Employee(103,"sk",9000000.0));

//Optional<Employee> res =emp.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()).skip(1).findFirst();
//System.out.println(res);

Optional<Employee> res1=emp.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed()).skip(1).findFirst();
System.out.println(res1);

emp
}
}


package com.assesments;

import java.util.Arrays;
import java.util.HashMap;

public class Employee {

	private int rollNo;
	private String name;
	private Double salary;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int rollNo, String name, Double salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}


 
	

}

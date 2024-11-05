package com.nt;

public class Employee {

	public int id;

	public int salary;

	public String name;

	public String department;

	public String Gender;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", department=" + department
				+ ", Gender=" + Gender + "]";
	}

	public Employee(int id, int salary, String name, String department, String gender) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.department = department;
		Gender = gender;
	}
	
	

	

	
	
}

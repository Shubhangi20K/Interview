package com.multi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	public Student(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String Name;
		int Age;
		String Subject;
		List<Student> st= new ArrayList<>(Arrays.asList(
				new Student("shubhangi",20,"Maths"),
				new Student("shubhanshu",21,"Science")
				));
		st.stream().sorted(Comparator.comparingInt()).collect(Collectors.toList());
		
	}
}

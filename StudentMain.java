package com.assesments;

import java.util.TreeMap;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"asb");
		
		Student s2 = new Student(1,"xyz");
		
		TreeMap<Student,String> ss= new TreeMap<Student,String>();
		
		ss.put(s1, "shubhangi");
		ss.put(s2, "shubhanshu");
		System.out.println("StudentMain.main()" + ss.get(ss));
	}
}

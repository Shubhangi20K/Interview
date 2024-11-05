package com.assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class filter {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();

		li.add("shubhangi");
		li.add("shubhanshu");
		li.add("jaydeep");
		li.add("arun");
		li.add("prabha");
		li.add("swapnil");
		li.add("swapnil");
		List<String> res = li.stream().filter(x -> x.length() > 5).toList();
		System.out.println(res);
		Iterator itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<String> li1 = new ArrayList<>();

		li1.add("shubhangi");
		li1.add("shubhanshu");
		li1.add("jaydeep");
		li.add("arun");
		li1.add("prabha");
		li1.add("swapnil");
		li1.add("swapnil");

		List<String> result = li1.stream().distinct().toList();
		System.out.println(result);

		List<String> li2 = new ArrayList<>();

		li2.add("shubhangi");
		li2.add("shubhanshu");
		li2.add("jaydeep");
		li.add("arun");
		li2.add("prabha");
		li2.add("swapnil");
		li2.add("swapnil");

		List<String> Result1 = li2.stream().limit(4).toList();
		System.out.println(Result1);

		List<String> li3 = new ArrayList<>();

		li3.add("shubhangi");
		li3.add("shubhanshu");
		li3.add("jaydeep");
		li3.add("arun");
		li3.add("prabha");
		li3.add("swapnil");
		li3.add("swapnil");

		List<String> Result2 = li3.stream().skip(5).toList();
		System.out.println(Result2);

		List<String> li31 = new ArrayList<>();

		li31.add("shubhangi");
		li31.add("shubhanshu");
		li31.add("jaydeep");
		li31.add("arun");
		li31.add("prabha");
		li31.add("swapnil");
		li31.add("swapnil");

		li31.stream().map(String::length).forEach(System.out::println);

		List<String> li4 = new ArrayList<>();

		li4.add("shubhangi");
		li4.add("shubhanshu");
		li4.add("jaydeep");
		li4.add("arun");
		li4.add("prabha");
		li4.add("swapnil");
		li4.add("swapnil");
		li4.stream().sorted().forEach(System.out::println);

		List<String> li5 = new ArrayList<>();

		li5.add("shubhangi");
		li5.add("shubhanshu");
		li5.add("jaydeep");
		li5.add("arun");
		li5.add("prabha");
		li5.add("swapnil");
		li5.add("swapnil");

		li5.stream().sorted((String name1, String name2) -> name1.length() - name2.length())
				.forEach(System.out::println);

		List<Integer> sum = Arrays.asList(10, 20, 3, 5);
		Integer result6 = sum.stream().reduce(0, (a, b) -> a + b);
		System.out.println(result6);

		long sum1 = Arrays.stream(new int[] { 10, 20, 30, 5 }).sum();
		System.out.println(sum1);

		List<String> li51 = new ArrayList<>();

		li51.add("shubhangi");
		li51.add("shubhanshu");
		li51.add("jaydeep");
		li51.add("arun");
		li51.add("prabha");
		li51.add("swapnil");
		li51.add("swapnil");
		long r = li51.stream().count();
		System.out.println(r);

		List<String> li511 = new ArrayList<>();

		li511.add("shubhangi");
		li511.add("shubhanshu");
		li511.add("jaydeep");
		li511.add("arun");
		li511.add("prabha");
		li511.add("swapnil");
		li511.add("swapnil");
		List<String> r1 = li511.stream().limit(4).collect(Collectors.toList());
		System.out.println("----------" + r1);

		String[] name6 = { "shubhangi" };
		Arrays.stream(name6).map(String::toUpperCase).peek(e -> System.out.println("Mapped Name :" + e)).toArray();

		List<Integer> l4 = Arrays.asList(1, 2, 3, 4, 5, 6);
		l4.stream().filter(i -> i > 2).forEach(System.out::println);

		List<Integer> l5 = Arrays.asList(1, 7, 2, 3, 4, 5, 6);
		l5.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		List<Integer> l6 = Arrays.asList(11, 12, 13, 14, 15, 16);
		l6.stream().sorted().skip(5).limit(1).forEach(System.out::println);
		List<Integer> l7 = Arrays.asList(11, 12, 13, 14, 15, 16);
		List<Integer> re = l7.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(re);

		String s = "shubhangi";
		StringBuffer sb = new StringBuffer(s).reverse();
		System.out.println(sb);

		String s1 = "shubhangi is a good girl";
		String rew = Arrays.stream(s1.split("\\s")).max(Comparator.comparingInt(String::length)).get();
		System.out.println(rew);

		Department l1 = new Department("1", "shubhangi", 820000.0);
		Department l2 = new Department("2", "shubhanshu", 1500000.0);
		Department l3 = new Department("3", "swapnil", 1500000.0);
		Department l41 = new Department("3", "jaydeep", 1500000.0);
		List<Department> dep = new ArrayList<Department>();
		dep.add(l1);
		dep.add(l2);
		dep.add(l3);
		dep.add(l41);
		System.out.println(dep);
		Department rest = dep.stream().max(Comparator.comparingDouble(x -> x.getSalary())).get();
		System.out.println(rest);
		
	//	List<String>resd=dep.stream().filter(x->x.getSalary()>1500000).map(x->x.getName()).forEach(e-> System.out.println(e));
	//	List<Department> startWithoJ= 	dep.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
		//System.out.println(startWithoJ);
		List<Department> ds= dep.stream().skip(1).collect(Collectors.toList());
		System.out.println(ds);
		
dep.stream().collect(Collectors.groupingBy(x->x.getSalary(),Collectors.toList()));
//		System.out.println(d3);

	}

}
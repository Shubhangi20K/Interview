package com.assesments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicate {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1,1,2,3,4);
		String  s="Shubhangi";

		List<Integer> Result = l1.stream().distinct().collect(Collectors.toList());
		System.out.println(Result);
		/*
		 * List<String> Result = Arrays.asList("a","a","b"); Result.stream().filter(i ->
		 * Collections. frequency(Result, i) > 1).collect(Collectors.toSet())
		 * .forEach(System.out::println);
		 */
		
	List<Entry<Character, Long>>Ans=	s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(i->i.getValue()>1).collect(Collectors.toList());
	System.out.println(Ans);

	int a=1213;
	List<Entry<Integer, Long>>k=Arrays.asList(a).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
	.stream().filter(i->i.getValue()==1).collect(Collectors.toList());

	System.out.println(k);
	}
}

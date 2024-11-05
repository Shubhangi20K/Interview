package com.assesments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Inttt {
	public static void main(String[] args) {
		/*
		 * List<Integer> myList = Arrays.asList(18,81,4451,1967,13,51);
		 * 
		 * List<Integer> Result= myList.stream().filter(i->i%2!=0).toList();
		 * System.out.println(Result);
		 */
		
		List<Integer> numbers = Arrays.asList(2,3,3,4,5,5,4,3,3,3);
		Map<Integer, Long> Result =		numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(Result);

		/*
		 * numbers.stream() .filter(i -> Collections.frequency(numbers, i) > 1)
		 * .collect(Collectors.toSet()) .forEach(System.out::println);
		 */
	}

}

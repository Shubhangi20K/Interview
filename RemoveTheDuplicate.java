package com.assesments;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveTheDuplicate {

	public static void main(String[] args) {
		List<String> lengthofLongestStr = Arrays.asList("shubhangi", "shubhanhu", "shubhanhu");
		List<String> f = lengthofLongestStr.stream().distinct().collect(Collectors.toList());

		System.out.println("\nLength of Longest String is = " + f);

		List<String> ff = lengthofLongestStr.stream().filter(i -> Collections.frequency(lengthofLongestStr, i) > 1)
				.collect(Collectors.toList());
		System.out.println(ff);

		String q = "shubhangi";
		String s[]= String.valueOf(q).split("");
		List<String> w = Arrays.asList(s);
		w.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(o->o.getValue()>1).forEach(u->{System.out.println(u.getKey());
		});
		
		
		
		
		
		
		
	}

}
	
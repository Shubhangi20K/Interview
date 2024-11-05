package com.multi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	
	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1,3,8),
		Arrays.asList(1,3,8)	);
List<Object> Result=list.stream() .map(i -> i.stream()).collect(Collectors.toList());
System.out.println(Result);
	}

}

package com.nt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindLargestElement {

	public static void main(String[] args) {

	List<Integer> a = Arrays.asList(1,2,5,6,3,2);
a.stream().distinct().sorted().skip(3).limit(1).forEach(System.out :: println);
	}

}

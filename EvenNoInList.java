package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoInList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4);

		List<Integer> Result=list.stream().filter(i->i%2==0).collect(Collectors.toList());

		System.out.println(Result);

	}

}

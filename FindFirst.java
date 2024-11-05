package com.assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("shubhangi", "shubhanshu");

		Optional<String> l1 = str.stream().findFirst();
		System.out.println(l1);

		String res = str.stream().max(Comparator.naturalOrder()).get();
		System.out.println(res);
		/*
		 * List<String>li= new ArrayList<>(); li.add("shubhangi is a good girl");
		 * li.stream().mapToLong(s->s.chars().filter(Character ::
		 * isLowerCase).count()).max().isPresent();
		 */
		String res1= Stream.of("Shubhangi is a good girl").max(Comparator.comparing(String :: valueOf)).get();
		System.out.println(res1);
	}


}

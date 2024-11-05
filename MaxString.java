package com.assesments;

import java.util.Arrays;
import java.util.Comparator;

public class MaxString {

	public static void main(String[] args) {
		String input = "Shubhangi is a good girl";
		/*
		 * String longestWord = Arrays.stream(input.split("\\s+"))
		 * .max(Comparator.comparingInt(String::length)).get(); //.orElse(null);
		 */
		String res=		Arrays.stream(input.split("\\s+")).max(Comparator.comparingInt(String::length)).get();
		//System.out.println(longestWord);
		System.out.println(res);
	}
}

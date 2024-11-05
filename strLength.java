package com.multi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class strLength {

	public static void main(String[] args) {
		/*
		List<String> length = Arrays.asList("shubhangi","kuirelay");
		List<Integer> str = length.stream().map(i->i.length()).collect(Collectors.toList());
		System.out.println(str);
		 */

		String input = "Shubhangi is a good girl";
		String[] words = input.split("\\s+");
		String longestWord = " ";

		for (String word : words) {
			if (word.length() > longestWord.length())
				longestWord = word;
		}
		System.out.println(longestWord);
	}




}

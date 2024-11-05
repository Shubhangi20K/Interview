package com.multi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
		int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
		Arrays.stream(numbers).filter(o -> o % 2 == 0);
		
		
		System.out.println("number is even" + numbers );
		
	}
}



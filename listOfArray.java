package com.assesments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listOfArray {
	
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(18,81,4451,1967,13,51);
		
		System.out.println("orignal List" +myList);
		
		
		List<Integer> Result = myList.stream().filter(num-> num.toString().endsWith ("1")).collect(Collectors.toList());
		System.out.println("listOfArray" +Result);
		
	}

}

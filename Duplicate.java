package com.multi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	   public static void main(String []args) {
	      // create a list with duplicate items
	      List<Integer> itemsList = Arrays.asList(10, 12, 10, 33, 40, 40, 61, 61);
	      // declaring a new Set 
	      Set<Integer> newitemSet = new HashSet<>();
	      System.out.println("The list of duplicate Items: ");
	      itemsList.stream() // converting list to stream
	         .filter(nums -> !newitemSet.add(nums)) // to filter out the elementsthat are not added to the set
	         .forEach(System.out::println); // print the duplicates
	   }
	}

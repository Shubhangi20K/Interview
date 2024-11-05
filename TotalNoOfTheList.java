package com.assesments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotalNoOfTheList {

	public static void main(String[] args) {
	
		List<String> str = Arrays.asList("shubhangi" ,"shubhanshu","kurelay");
		long Result=str.stream().count();
		System.out.println(Result);
	}
}

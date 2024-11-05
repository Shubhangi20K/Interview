package com.multi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mappp {
	
	public static void main(String[] args) {
		
		List<String> num= Arrays.asList("1","2","8");
		
	List<Integer> Result=	num.stream().map(Integer::valueOf).collect(Collectors.toList());
	
	System.out.println(Result);

		
	}
	

}

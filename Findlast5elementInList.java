package com.assesments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Findlast5elementInList {

	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		Integer res=	li.stream().sorted().skip(li.size()-6).findFirst().get();
	
		System.out.println(res);
	
	}
}

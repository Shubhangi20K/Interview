package com.assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartString {
	public static void main(String[] args) {
		//String ch[]= {"asc","bbbc","aasa"};
		List<Integer> myList = Arrays.asList(18,81,4451,1967,13,51);
		//	List<String> Result=Stream.of(ch).filter(i->i.startsWith("a")).collect(Collectors.toList());
		//List<Integer> Result=myList.stream().filter(i->i.toString().startsWith("1")).collect(Collectors.toList());
		List<Integer> Result =myList.stream().filter(i->i.toString().endsWith("7")).collect(Collectors.toList());
		System.out.println(Result);
		StringBuffer s = new StringBuffer("shub");
		//StringBuffer j = new StringBuffer("hghd");

		List<StringBuffer> n = Stream.of(s.reverse()).collect(Collectors.toList());
		System.out.println(n);
		String ch="string";
long Results=Stream.of(ch).collect(Collectors.counting());

System.out.println(Results);
	}




}


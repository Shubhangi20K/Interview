package com.nt;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class H {
	public static void main(String[] args) {


		
		int a=10;
		int b=30;
		int c;
		Stream.of(c).filter(e->a*b).collect(Collectors.toList()).forEach(System.out::println);
	}
}
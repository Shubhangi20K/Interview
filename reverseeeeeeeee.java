package com.assesments;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseeeeeeeee {

	public static void main(String[] args) {

		/*
		 * String Name ="capgemini"; StringBuffer stringBuffer= new StringBuffer(Name);
		 * stringBuffer.reverse(); System.out.println("reverseeeeeeeee.main()"
		 * +stringBuffer);
		 */
		String str = "capgemini";
		String rev=Stream.of(str).map(String-> new StringBuffer(str).reverse()).collect(Collectors.joining());
		System.out.println(rev);
	}



}

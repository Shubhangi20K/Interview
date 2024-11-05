package com.assesments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class rev {
public static void main(String[] args) {
	
String s="shubhangi";
String ans=Stream.of(s).map(w-> new StringBuffer(s).reverse()).collect(Collectors.joining());
System.out.println(ans);
}
}

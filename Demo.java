package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<List<String>> l1= Arrays.asList(Arrays.asList("a","b","c"),
				         Arrays.asList("d","e","f"),
				         Arrays.asList("g","h","i"));
		
	List<String> ans=	l1.stream().flatMap(i->i.stream()).collect(Collectors.toList());
	System.out.println(ans);
	l1.stream().filter(i->i.stream())
	}
}


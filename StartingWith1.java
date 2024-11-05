package com.assesments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWith1 {

	public static void main(String[] args) {

		List<Integer> l1= Arrays.asList(11,31,23,57);
		List<Integer> Result=l1.stream().filter(i->i.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(Result);
		List<Integer> r1= l1.stream().filter(k->k.toString().endsWith("7")).collect(Collectors.toList());
		System.out.println(r1);

		List<String> s1=Arrays.asList("shubhangi","shubhanshu");
		List<String> re= s1.stream().filter(o->o.toString().startsWith("s")).collect(Collectors.toList());
		List<String> se=s1.stream().filter(p->p.toString().endsWith("i")).collect(Collectors.toList());

		System.out.println(se);
		System.out.println(re);
	}

}

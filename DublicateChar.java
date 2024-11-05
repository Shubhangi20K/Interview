package com.nt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DublicateChar {

	public static void main(String[] args) {
		/*
		 * String s= "This is apple";
		 * 
		 * Map<Object,Long> Duplicate=s.chars().mapToObj(i->(char)
		 * i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toMap(Map.
		 * Entry::getKey,Map.Entry::getValue)); System.out.println(Duplicate);
		 */
		/*
		 * int x=12341; String s[]=String.valueOf(x).split(""); List<String> list2=
		 * Arrays.asList(s);
		 * list2.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()))
		 * .entrySet().stream().filter(x1->x1.getValue()>1).forEach(u->{System.out.
		 * println(u.getKey()+":"+u.getValue()); });
		 */

		/*
		 * int o=12452; String a[]=String.valueOf(o).split("");
		 * List<String>list1=Arrays.asList(a);
		 * list1.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()))
		 * .entrySet().stream().filter(i->i.getValue()>1).forEach(u->{System.ou	t.println
		 * (u.getKey()+ ":" +u.getValue());});
		 */

		/*
		 * int x=123434; String t[]= String.valueOf(x).split("");
		 * List<String>c=Arrays.asList(t);
		 * c.stream().collect(Collectors.groupingBy(j->j,Collectors.counting()))
		 * .entrySet().stream().filter(i->i.getValue()>1).forEach(p->{System.out.println
		 * (p.getKey()+ ":" +p.getValue());});
		 */
		/*
		 * String s="This is apple"; Map<Object,Object> did=s.chars().mapToObj(n->(char)
		 * n).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet().stream().filter(l->l.getValue()>1).collect(Collectors.toMap(Map.
		 * Entry::getKey,Map.Entry::getValue)); System.out.println(did);
		 */

		int e=12312;
		List<Integer> g=Arrays.asList(e);
	g.stream().collect(Collectors.groupingBy(f-> f,Collectors.counting())).entrySet()
				.stream().filter(d->d.getValue()>1).forEach(k->{System.out.println
					 (k.getKey()+ ":" +k.getValue());});
	System.out.println(g);


	/*
	 * int x=12341; String s[]=String.valueOf(x).split(""); List<String> list2=
	 * Arrays.asList(s);
	 * list2.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()))
	 * .entrySet().stream().filter(x1->x1.getValue()>1).forEach(u->{System.out.
	 * println(u.getKey()+":"+u.getValue()); });
	 */
}
}
package com.assesments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HeshSet {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(1);
		al.add("shubhangi");
		al.add(null);
		HashSet hs = new HashSet(al);
		hs.add(10);
		hs.add("sh");
		hs.add(null);
		hs.add(null);

		System.out.println("add arraylist and hashset values : " + hs);
		System.out.println("add arraylist and hashset values : " + hs.size());
		// System.out.println("getting the arrayList and hastSetSize : " + hs.size());
		Iterator it = hs.iterator();
		System.out.println("Iterator the element : " + it);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

package com.assesments;

import java.util.HashSet;
import java.util.Set;

class mains {

	private Integer id;
	private String name;

	mains(Integer id, String name) {

		this.id = id;

		this.name = name;

		mains e1 = new mains(1, "Sachin");

		mains e2 = new mains(1, "Sachin");

		mains e3 = new mains(1, "Sachin");

		Set<mains> set = new HashSet<>();

		set.add(e1);

		set.add(e2);

		set.add(e3);

		System.out.println(set.size());
	}
}
package com.multi;

public class Varargs {

	void show(int a)
	{
		System.out.println("int method" );
	}
	void show(String... a)
	{
		System.out.println("Varargs method");
	}
	public static void main(String[] args) {
		Varargs v = new Varargs();
		v.show("a","b","c");
		v.show(2);
	}
}

package com.multi;

public class Overload_main_method {
	public static void main(String[] args) {
		System.out.println("Overload_main_method.main() String Type ");
		Overload_main_method t = new Overload_main_method();
		t.main(1);
	}
	public static void main(int a) {
		
		System.out.println("Overload_main_method.main() int type");
		
	}

}

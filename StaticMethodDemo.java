package com.multi;

public class StaticMethodDemo {
//static	int num;
	public static void main(String[] args) {
		System.out.println(" inside main ");
		StaticMethodDemo.method1();
		System.out.println("Back in main");
//System.out.println(StaticMethodDemo.num);
		}

	static void method1() {
		System.out.println("inside medhod1");
		StaticMethodDemo.method2();
		System.out.println("Back in method1 ");
	}

	static void method2() {
		System.out.println("inside method2");
		StaticMethodDemo.method1();
	}



}


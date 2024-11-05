package com.assesments;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		System.out.println(" Singleton constrocter is created");
	}

	public static Singleton getInstance() {
		if (instance == null)

			instance = new Singleton();
		return instance;
	}

	public void doSomething() {
		System.out.println("doing something");
	}

	public class xy {

		public static void main(String[] args) {
			Singleton singleton = new Singleton();
			singleton.getInstance().doSomething();
		}
	}

}

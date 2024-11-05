package com.multi;

public class Singleton {

	private static Singleton Instance;

	private Singleton() {
		System.out.println("Singleton.Singleton(.................)");
	}

	private static Singleton GetInstance() {
		if (Instance == null)

			Instance = new Singleton();
		return Instance;
	}

	public void doSomething() {
		System.out.println("Singleton.doSomething()");

	}

	public class gfs
	{
		public void main(String[] args) {
			
			Instance.GetInstance().doSomething();
		}
	}
}

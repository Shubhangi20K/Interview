package com.multi;

public class Test2 {

	void show(int a , float f)
	{
		System.out.println("int float monthed");
	}

	void show(float f , int a)
	{
		System.out.println("float Int method");
	}

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.show(1, 12.5f);
		t.show(20.7f, 30);
		t.show(1, 20);

	}

}

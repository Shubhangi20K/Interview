package com.multi;

public class Test1 {
	void show(StringBuffer sb)
	{
		System.out.println("StringBuffer method");
	}
	void show( String s)
	{
		System.out.println("String method ");
	}

	public static void main(String[] args) {
		Test1 ap = new Test1();
		ap.show("shubhangi");
		ap.show(new StringBuffer ("xyz"));
		ap.show(null);
	}
}


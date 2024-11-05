package com.nt;

public class HGF {

	public static void main(String[] args) throws ArithmeticException {
		int a=10;
		int b=0;
		int c;
		
		try {
			c= a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println("exception Rasied" +e);
		}
	}
}

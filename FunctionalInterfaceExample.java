package com.nt;

import java.lang.annotation.Annotation;

@FunctionalInterface  
interface sayable{  
	void say(String msg);
}  
public class FunctionalInterfaceExample implements sayable{

	public void say(String msg)
	{
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample x= new FunctionalInterfaceExample();
		x.say("hello");
	//	System.out.println(x);
	}
}
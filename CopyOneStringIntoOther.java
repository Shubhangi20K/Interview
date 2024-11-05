package com.multi;

import java.util.stream.Stream;

public class CopyOneStringIntoOther {
 public static void main(String[] args) {
	
	 String FirstString="shubhangi";
	 
		/*
		 * String CopyString=new StringBuffer(FirstString).toString();
		 * 
		 * System.out.println(FirstString); System.out.println(CopyString);
		 * System.out.println( FirstString==CopyString);
		 */	

	 String CopyString=String.copyValueOf(FirstString.toCharArray());
	 
	 System.out.println(FirstString);
	 System.out.println(CopyString);
	 System.out.println(FirstString==CopyString);
}
}
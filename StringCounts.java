package com.multi;

public class StringCounts {

	public static void main(String[] args) {

		String s= "shubhangi";
		s=s.concat("\0");
		char x[]=s.toCharArray();
		int count =0;
		int i=0;
		while(x[i]!='\0')
		{
			count++;
			i++;
		}
		System.out.println("StringCounts \n" +i);
		
	}
}

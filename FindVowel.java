package com.multi;

public class FindVowel {

	public static void main(String[] args) {

		String s ="shubhangi";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i) =='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				System.out.println("Given string contains "+s.charAt(i)+" at the index "+i);
				//System.out.println("print the vowel \n" +i);
			}
		}

	}


}

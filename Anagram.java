package com.nt;

import java.util.Arrays;

public class Anagram {

	public static void isAnagram(String str1, String str2) {

		String s1 = str1.replaceAll("\\", "");
		String s2 = str2.replaceAll("\\", "");

		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char ch1[] = s1.toLowerCase().toCharArray();
			char ch2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);

		}
		if (status) {
			System.out.println(s1 + "ans" + s2 + "are isAnagram");
		} else {
			System.out.println(s1 + "ans" + s2 + "are not isAnagram");
		}
	}

	public static void main(String args[])   
	{    
	//calling function      
	isAnagram("HEART", "EARTH");    
	isAnagram("TRIANGLE", "INTEGRAL");    
	isAnagram("TOSS", "SHOT");   
	}    
	}
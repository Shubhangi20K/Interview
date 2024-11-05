package com.multi;

public class Reverse {

public static void main(String[] args) {
	String Name="shubhangi";
StringBuffer sb = new StringBuffer(Name);

sb.reverse();

System.out.println("Reverse the String  \n" + sb);
}
}



/*
 * public static String reverseString(String str) { StringBuffer sb = new
 * StringBuffer(str);
 * 
 * sb.reverse(); return sb.toString(); } public static void main(String[] args)
 * {
 * 
 * System.out.println(Reverse.reverseString("shubhangi")); }
 */
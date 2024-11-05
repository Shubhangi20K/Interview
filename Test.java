package com.assesments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {


	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("c:/ABC.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

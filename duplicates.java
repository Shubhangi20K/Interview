package com.multi;

import java.util.Scanner;

public class duplicates {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (scanner.hasNext()) {
	            String str = scanner.next();
	            int num = scanner.nextInt();

	            // Format and print the output
	            System.out.printf("%-15s%03d%n", str, num);
	        }

	        scanner.close();
	    }
	}



package com.multi;

import java.util.Arrays;

class HelloWorld {
	    public static void main(String[] args) {
	        int arr[]= {4,3,8,7};
	        Arrays.stream(arr).filter(i -> i%3 == 0).mapToDouble(Math :: sqrt).forEach(i->{
	            System.out.println(i);
	        });
	      }
	}


package com.multi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {
	public static void main(String[] args) {
		
	
	Integer arr[]= { 4,6,2,7,1,8,3,5,9,10};
//String s="shubhangi";
	
	  Arrays.sort(arr, Collections.reverseOrder());
	  
	
      System.out.println("Array elements after sorting");  
      for (int i=0;i<arr.length;i++) { 
    	  
    	  {
    		
          System.out.println(arr[i]);  
      }  
	//List<Integer> list2 =i.stream().sorted().collect(Collectors.toList());
	//Stream.of(arr).sorted().collect(Collectors.toList()).forEach(System.out::println);
      
}

}
}
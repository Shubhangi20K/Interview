package com.assesments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTwo {

	public static void main(String[] args) {

		int a[]= {1,2,3,5};
		
		int expected_no= a.length +1; 
		
		int total_no= expected_no *(expected_no+1)/2;
		//System.out.println(total_no);
				
		int sum =0;
		for(int i =0; i<a.length;i++)
		{
			 sum=sum+a[i];
		}
		System.out.println(total_no- sum);
				
	/*	int b[]	= {1,2,5,3,6};

		int al=a.length;
		int b1=b.length;
		int c[]= new int [al+b1];
		
		int count =0;
		
		for(int i=0; i<al;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[count]=b[j];
			count ++;
			
		}
		
		for(int k=0;k<al+b1;k++)
		{
			System.out.println(c[k]);
		}
		
		 List<Integer> list =Arrays.stream(c).boxed().collect(Collectors.toList());
		 List<Integer> list1=	list.stream().distinct().collect(Collectors.toList());
		 System.out.println(list1);
	
		 
	}*/
	}
}

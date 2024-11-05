package com.multi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Multi {
	public static void main(String[] args) {

	int[] arr ={12, 0, 7, 0, 8, 0, 3};
		
		for(int i=0; i< arr.length;i++){
			for(int j=i+1; j< arr.length;j++){
				int temp=0;
				if(arr[i] == 0){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
			System.out.println(arr[i]);
		}

	}}
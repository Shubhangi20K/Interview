package com.assesments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecoundHight {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 6, 8, 12, 9, 23 };

		int temp = 0, size;
		size = arr.length;

		for (int i = 0; i < size; i++)
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j])
					temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}

		System.out.println("SecoundHight.main()" + arr[size - 2]);
	}

}

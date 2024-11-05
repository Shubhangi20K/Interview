package com.assesments;

public class ThiredHighestSalary {

	//public static void main(String[] args) {

	public static int getThiredHighestSalary(int a[], int total)
	{
		int temp=0;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];

					a[j]=temp;
				}
			}
		}
		return a[total-1];


	}
	public static void main(String[] args) {
		int a[]= {20,21,3,30};
		System.out.println("ThiredHighestSalary.main() \n" +getThiredHighestSalary(a,4));
	}



}


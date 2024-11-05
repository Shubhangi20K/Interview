package com.multi;

public class Patternnn {

	
public static void main(String[] args) {
	/*
	 * System.out.println("11111111"); System.out.println("1    1");
	 * System.out.println("11111111"); System.out.println("1    1");
	 */
	
	
	int rows = 4;
	int columns =8;
	
	for (int i= 0;i<rows; i++)
	{
		for(int j=0;j<columns ;j++)
		{
			if(i==0 || i==rows-1)
			{
				System.out.println('1');
			}
			else 
			{
				if (j==0|| j==columns-1)
					System.out.println('1');
			}
			else if(i == 1 && j == columns - 2)
			{
				System.out.println(' ');
			}
			else 
			{
				System.out.println(' ');
			}
		}
	}
	System.out.println();
}
}

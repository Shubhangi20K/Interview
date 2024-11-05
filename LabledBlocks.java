package com.multi;

public class LabledBlocks {

	public static void main(String[] args) {
		
		int x=20;
	
		l1:
		{
			System.out.println("inside the block");
			if (x==20)
			{
				break l1;
			}
			System.out.println("outside the block");
		}
		
		System.out.println("totley outside the block ");
				
	}
}

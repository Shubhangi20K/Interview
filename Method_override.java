package com.multi;

public class Method_override {

	void show()
	{
		System.out.println("1");
	}

	public class ride extends Method_override
	{
		void show()
		{
			System.out.println("2");
		}


	}
	public static void main(String[] args) 
	{
		ride i = new ride();
		i.show();
	}

}

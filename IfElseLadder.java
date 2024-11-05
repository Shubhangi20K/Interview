package com.multi;

public class IfElseLadder {

	public static void main(String[] args) {

		String Choice ="Check Balance";
		
		if(Choice.equals("Check Balance"))
		{
			System.out.println("Check Balance");
		}
		else if (Choice.equals("Change pin"))
		{
			System.out.println("Change pin");
		}

		else if(Choice.equals("Withdrow"))
		{
			System.out.println("Withdrow");
		}

		else
		{
			System.out.println("Time out ");
		}
	}

}

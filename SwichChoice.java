package com.multi;

public class SwichChoice {


	public static void main(String[] args) {

		String Choice ="Check Balance;";

		switch (Choice) {


		case  "Check Balance ":
			System.out.println("Check Balance");
			break;

		case "Change pin" :
			System.out.println("Change pin");
			break;

		case "Withdrow":
			System.out.println("Withdrow");
			break;

		default: 
			System.out.println("Time out ");
			break;
		}
	}

}


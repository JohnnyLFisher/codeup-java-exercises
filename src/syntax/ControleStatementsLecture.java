package syntax;

import java.util.Scanner;

public class ControleStatementsLecture {

	public static void main(String[] args) {
		double discountPercent = 2.1;
		if (discountPercent == 2.1) { // equal to a numeric literal
			System.out.println("You got 2% off!");
		}

		char letter = ';';
		if (letter == 'y') {
			System.out.println("The letter was y. I guess that means Yes.");
		} else if (letter == 'n') {
			System.out.println("So you are saying no?");
		} else {
			System.out.println("I don't know what that letter means.");
		}

		boolean isValid = true;
//		System.out.println(isValid == true);             // equal to the false value
		if (isValid) // better way
			System.out.println("It is Valid");


		int subtotal = 67;
		System.out.println(subtotal != 0);                // not equal to a numeric literal

		String accountOwner = "johnnyf";
		String loggedInUser = accountOwner;
		System.out.println(loggedInUser == accountOwner);// not equal to a variable
		loggedInUser = "johhny";
		loggedInUser += "f";
		System.out.println(loggedInUser == accountOwner);

		int years = 17;
		System.out.println(years > 0);                    // greater than a numeric literal
		int i = 7;
		int months = 12;
		System.out.println(i < months);                    // less than a variable

		System.out.println(subtotal >= 500);            // greater than or equal to a numeric literal
		int quantity = subtotal;
		int reorderPoint = 500;
		if (quantity <= reorderPoint) {                    // less than or equal to a variable
			System.out.println("We need to order more");
		}

		// print the numbers 1 through 5

		for (int h = 1; h < 100; h++) {
			System.out.println(h);
			if (h == 5) {
				break; // --------------+
			} //                        |
		} //                            |
		// <----------------------------+

		for (int j = 1; j <= 10; j++) { // <--+
			if (j % 2 == 1) { //              |
				continue; //  ----------------+
			}
			System.out.println(j);
		}
	}
}
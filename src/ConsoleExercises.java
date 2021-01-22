import java.util.Scanner;

public class ConsoleExercises {

	public static void main(String[] args) {

		/** Console IO Exercise */


		/*
		//  Formatting Numeric Print Output
		https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		//  Java printf Method Quick Reference
		https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
		//  The Scanner class
		http://www.cs.utexas.edu/users/ndale/Scanner.html
		//  Creating and using Packages
		https://docs.oracle.com/javase/tutorial/java/package/packages.html
		//  The .useDelimiter method
		http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#useDelimiter(java.util.regex.Pattern)
		 */

		// TODO: Write some Java code that uses the variable pi to output the following:
		//  "The value of pi is approximately 3.14."
		//  Don't change the value of the variable;
		//  instead, reference one of the links above and use System.out.format to accomplish this.
		double pi = 3.141592;

		System.out.format("The value of pi is approximately %.2f%n", pi);


		// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an interger:");
		int userInt = scanner.nextInt();

		System.out.println(userInt);


		// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable.
		//  Then, display them back in the console, each on a newline.

		System.out.println("Please enter 3 words:");
		String userInput1 = scanner.next();
		String userInput2 = scanner.next();
		String userInput3 = scanner.next();

		System.out.println(userInput1 + "\n" + userInput2 + "\n" + userInput3);
		scanner.nextLine(); // clears the input

		// TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
		//  Then, display that sentence back to the user.
		// TODO: Rewrite the above example using the nextLine method.

		System.out.println("Please enter a sentence:");
//		String userSentence = scanner.next();
		String userSentence = scanner.nextLine();

		System.out.print(userSentence);


		// TODO: Prompt the user to enter values of length and width of a classroom at Codeup.
		//  Use the nextLine method to get user input and parse the resulting string to a numeric type.
		// TODO: Display the area and perimeter of that classroom.

		System.out.println("Please enter the length of the room:");
		String length = scanner.nextLine();
		System.out.println("Please enter the width of the room:");
		String width = scanner.nextLine();

		int area = Integer.parseInt(length) * Integer.parseInt(width);
		int perimeter = 2 * (Integer.parseInt(length) + Integer.parseInt(width));

		System.out.printf("Area: " + area + "\nPerimeter: " + perimeter);

	}

}

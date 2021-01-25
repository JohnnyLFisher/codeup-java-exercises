package syntax.lecturesAndExamples;

import java.util.Scanner;

public class ConsoleIOLecture {

	public static void main(String[] args){

//		System.out.print("This is from print.\n");
//		System.out.println("Hello, Kalypso!");
		String greeting = "Bonjour";
		String name = "Kalypso";
		System.out.printf("%s, %s!%n", greeting, name);

		double price1 = 23.451;
		double price2 = 50;
		double price3 = 5.40;
		double total = (price1 + price2 + price3);
//		System.out.printf("Your total is: $%7.2f%n", total);
//		System.out.printf("Your total is: $%7.3f%n", total);
//		System.out.printf("Your total is: $%7f%n", -1*total);

//		Scanner scanner = new Scanner(System.in);
////	  Widget banana = new Widget("Johnny's Widget")
//		System.out.print("Please tell me your name: ");
//		name = scanner.next();
//		System.out.printf("%s, %s!%n", greeting, name);

		Scanner scanner = new Scanner(System.in);

//		System.out.print("Enter something: ");
//		String userInput = scanner.next();
//		String userInput2 = scanner.nextLine();

		System.out.print("Enter an Interger: ");
		Integer userInt = scanner.nextInt();
//		double userDouble = scanner.nextDouble();

		System.out.printf("You entered: --> \"%d\" <--", userInt);
//		System.out.println("And: --> \"" + userInput2 + "\" <--");
	}

}

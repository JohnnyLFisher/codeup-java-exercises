import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MethodsExercises {

	// repeating dialog for ending loops
	// returns true or false
	public static boolean repeat() {

		Scanner input = new Scanner(System.in);

		System.out.println("Type \"continue\" to enter another value or type anything else to exit");
		String answer = input.nextLine();

		if (answer.equalsIgnoreCase("continue")) {
			System.out.println("You have chosen to continue.");
			return true;
		} else {
			System.out.println("Shutting Down...");
			return false;
		}
	}


	/** Basic Arithmetic Methods */

	public static void addition(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

	public static void subtraction(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

	public static void multiplication(int num1, int num2) {
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	}

	public static void division(int num1, int num2) {
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	}

	public static void modulus(int num1, int num2) {
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}


	/** Range Method */

	public static void range(int min, int max) {

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Please input a number between " + min + " and " + max + ":");
			String answer = input.nextLine();
			int num = Integer.parseInt(answer);

			if (num > min && num < max) {
				System.out.println(num + " is an acceptable number.");
			} else if (num < min) { // too small
				System.out.println(num + " is too small.");
				continue;
			} else if (num > max) { // too large
				System.out.println(num + " is too large");
				continue;
			} else if (num == min) { // smallest possible
				System.out.println(num + " is the smallest acceptable number.");
			} else if (num == max) { // largest possible
				System.out.println(num + " is the largest acceptable number.");
			} else {
				System.out.println(num + " has somehow failed all checks.");
			}

			if (repeat()) {
				continue;
			}
			break;
		}
	}


	/** Factorial Method */

	public static void factorial() {

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Please input a number between " + 1 + " and " + 10 + ":");
			String answer = input.nextLine();
			int num = Integer.parseInt(answer);

			if (num < 1) { // too small
				System.out.println(num + " is too small.");
				continue;
			} else if (num > 10) { // too large //noInspection ConstantConditions
				System.out.println(num + " is too large.");
				continue;
			} else {
				System.out.println(num + " is an acceptable number.");
			}


			long fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(num + "! is " + fact);

			if (repeat()) {
				continue;
			}
			break;
		}
	}


	/** Dice Rolling Method */

	public static void diceRoll() {

		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a number of sides for the dice:");
			String answer = input.nextLine();
			int sides = Integer.parseInt(answer);
			int di1 = ThreadLocalRandom.current().nextInt(1, sides + 1);
			int di2 = ThreadLocalRandom.current().nextInt(1, sides + 1);

			System.out.println("Type \"continue\" to roll your two " + sides + "-sided dice or type anything else to exit");
			answer = input.nextLine();

			if (answer.equalsIgnoreCase("continue")) {
				System.out.println("Rolling Dice...");
				System.out.println("Di 1: " + di1);
				System.out.println("Di 2: " + di2);
				if (di1 == 1 && di2 == 1) {
					System.out.println("Snake Eyes!");
				} else if (di1 == di2) {
					System.out.println("Double!");
				}
			} else {
				System.out.println("Putting Away Dice...");
				break;
			}

			if (repeat()) {
				continue;
			}
			break;

		}
	}


	public static void main(String[] args) {
		methodSelector();
	}

	// method for selecting and running other methods based on user inputs
	public static void methodSelector() {

		while (true) {

			PrintStream sys = System.out;
			Scanner input = new Scanner(System.in);

			sys.println("Which method would you like to run? (type \"none\" to exit)");
			String answer = input.nextLine();
			String running = "Running method: " + answer;

			if (answer.equalsIgnoreCase("none")) {
				sys.println("Shutting Down...");
				break;
			} else if (answer.equalsIgnoreCase("addition")) {
				sys.println("Please enter required inputs in order and separated by a new line.");
				answer = input.nextLine();
				int num1 = Integer.parseInt(answer);
				answer = input.nextLine();
				int num2 = Integer.parseInt(answer);

				sys.println(running);
				addition(num1, num2);
			} else if (answer.equalsIgnoreCase("subtraction")) {
				sys.println("Please enter required inputs in order and separated by a new line.");
				answer = input.nextLine();
				int num1 = Integer.parseInt(answer);
				answer = input.nextLine();
				int num2 = Integer.parseInt(answer);

				sys.println(running);
				subtraction(num1, num2);
			} else if (answer.equalsIgnoreCase("multiplication")) {
				sys.println("Please enter required inputs in order and separated by a new line.");
				answer = input.nextLine();
				int num1 = Integer.parseInt(answer);
				answer = input.nextLine();
				int num2 = Integer.parseInt(answer);

				sys.println(running);
				multiplication(num1, num2);
			} else if (answer.equalsIgnoreCase("division")) {
				sys.println("Please enter required inputs in order and separated by a new line.");
				answer = input.nextLine();
				int num1 = Integer.parseInt(answer);
				answer = input.nextLine();
				int num2 = Integer.parseInt(answer);

				sys.println(running);
				division(num1, num2);
			} else if (answer.equalsIgnoreCase("modulus")) {
				sys.println("Please enter required inputs in order and separated by a new line.");
				answer = input.nextLine();
				int num1 = Integer.parseInt(answer);
				answer = input.nextLine();
				int num2 = Integer.parseInt(answer);

				sys.println(running);
				modulus(num1, num2);
			} else if (answer.equalsIgnoreCase("range")) {
				sys.println("Please enter required inputs in order and separated by a new line.");
				answer = input.nextLine();
				int num1 = Integer.parseInt(answer);
				answer = input.nextLine();
				int num2 = Integer.parseInt(answer);

				sys.println(running);
				range(num1, num2);
			} else if (answer.equalsIgnoreCase("factorial")) {
				sys.println(running);
				factorial();
			} else if (answer.equalsIgnoreCase("diceRoll")) {
				sys.println(running);
				diceRoll();
			} else {
				sys.println("That is not a valid method.");
			}

			System.out.println("Type \"continue\" to enter another method or type anything else to exit");
			answer = input.nextLine();

			if (answer.equalsIgnoreCase("continue")) {
				continue;
			}
			System.out.println("Putting Away Methods...");
			break;

		}
	}


	// template for adding more methods:
	/**
	 else if (answer.equalsIgnoreCase("METHOD_NAME_HERE")) {
	 sys.println("Please enter required inputs in order and separated by a new line.");

	 // if input requires int: //
	 answer = input.nextLine();
	 int EXAMPLE_PARAMETER1 = Integer.parseInt(answer);
	 // else: //
	 String EXAMPLE_PARAMETER2 = input.nextLine();

	 sys.println(running);
	 METHOD_NAME_HERE(EXAMPLE_PARAMETER1, EXAMPLE_PARAMETER2);
	 }
	 */
	// insert the new code before final else condition
}

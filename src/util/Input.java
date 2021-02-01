package util;

import java.util.Scanner;


public class Input {

	private Scanner scanner;

	public Input() {
		this.scanner = new Scanner(System.in);
	}

	public String getString() {
		return scanner.nextLine();
	}

	public boolean yesNo() {
		System.out.println("Please enter \"yes\" to continue, or \"no\" to stop.");
		String answer = scanner.nextLine();

		return answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yup") || answer.equalsIgnoreCase("yeah");
	}

	public int getInt(int min, int max) {
		int num;
		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Please input a number between " + min + " and " + max + ":");
			String answer = input.nextLine();
			num = Integer.parseInt(answer);

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

			if (yesNo()) {
				continue;
			}
			break;
		}
		return num;

	}

	public int getInt() {
		System.out.println("Please enter a minimum and maximum value seperated by a new line.");
		String answer = scanner.nextLine();
		int num1 = Integer.parseInt(answer);
		answer = scanner.nextLine();
		int num2 = Integer.parseInt(answer);
		return getInt(num1, num2);

	}

	public double getDouble(double min, double max) {
		double num;
		while (true) {

			Scanner input = new Scanner(System.in);
			System.out.println("Please input a number between " + min + " and " + max + ":");
			String answer = input.nextLine();
			num = Double.parseDouble(answer);

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

			if (yesNo()) {
				continue;
			}
			break;
		}
		return num;

	}

	public double getDouble() {
		System.out.println("Please enter a minimum and maximum value seperated by a new line.");
		String answer = scanner.nextLine();
		double num1 = Double.parseDouble(answer);
		answer = scanner.nextLine();
		double num2 = Double.parseDouble(answer);
		return getDouble(num1, num2);

	}

	public String setRadius() {
		System.out.println("Please enter a Radius:");
		return scanner.nextLine();
	}


}

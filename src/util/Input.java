package util;

import java.util.Scanner;

public class Input {

	private Scanner scanner;

	public Input(){
		this.scanner = new Scanner(System.in);
	}

	public String getString(){
		return getString("Please enter a string:");
	}
	public String getString(String prompt){
		System.out.println(prompt);
		return this.scanner.nextLine();
	}

	public boolean yesNo() {
		return yesNo("Please enter \"yes\" or \"no\": ");
	}
	public boolean yesNo(String prompt){
		System.out.print(prompt);

		String answer = this.scanner.nextLine();
		return (answer.equalsIgnoreCase("y") ||
				answer.equalsIgnoreCase("yes"));
	}

	public int getInt(){
		return getInt("Please enter an integer: ");
	}
	public int getInt(String prompt){
		System.out.print(prompt);
		return this.scanner.nextInt();
	}

	public int getInt(int min, int max){
		return getInt("Please enter an integer between "+min+" and "+max+": ",min,max);
	}
	public int getInt(String prompt, int min, int max){
		while (true) {
			System.out.println(prompt);
			int answer = this.scanner.nextInt();
			if (answer >= min && answer <= max)
				return answer;
		}
	}

	public double getDouble(){
		return getDouble("Please enter a double: ");
	}
	public double getDouble(String prompt){
		System.out.println(prompt);
		return this.scanner.nextDouble();
	}

	public double getDouble(double min, double max){
		return getDouble("Please enter a number between "+min+" and "+max+": ",min,max);
	}
	public double getDouble(String prompt, double min, double max){
		while (true) {
			System.out.println(prompt);
			double answer = this.scanner.nextDouble();
			if (answer >= min && answer <= max)
				return answer;
		}
	}
}

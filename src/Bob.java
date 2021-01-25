import java.util.Scanner;

public class Bob {

	public static void main(String[] args) {

		/** A Conversation With Bob */

		// TODO: Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
		//  Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
		//  He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
		//  He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
		//  He answers 'Whatever.' to anything else.

		Scanner userInput = new Scanner(System.in);

		System.out.println("Hi, I'm Bob.");
		System.out.println();

		while(true) {
			System.out.print("Enter a response: ");
			String userResponse = userInput.nextLine();
			System.out.println();

			if (userResponse.endsWith("?")) {
				System.out.println("Sure.");
			} else if (userResponse.endsWith("!")) {
				System.out.println("Whoa, chill out!");
			} else if (userResponse.equals("")) {
				System.out.println("Fine. Be that way!");
			} else {
				System.out.println("Whatever.");
			}
			System.out.println();

			System.out.println("Do you have anything else to say? Please answer \"yes\" or \"no\"");
			String userAnswer = userInput.nextLine();

			while (!userAnswer.equalsIgnoreCase("yes") && !userAnswer.equalsIgnoreCase("no")) {
				System.out.println("That is not a valid answer. Please answer \"yes\" or \"no\"");
				userAnswer = userInput.nextLine();
			}
			if (userAnswer.equalsIgnoreCase("yes")) {
				System.out.println("Cool.");
				System.out.println();
			} else {
				System.out.println("OK, goodbye then...");
				break;
			}
		}

	}

}

import java.util.Scanner;

public class ControlFlowExercises {

	public static void main(String[] args) {

		/** Control Flow Exercises */

		// TODO: Create an integer variable i with a value of 5.
		// TODO: Create a while loop that runs so long as i is less than or equal to 15
		// TODO: Each loop iteration, output the current value of i, then increment i by one.
		//  Your output should look like this: 5 6 7 8 9 10 11 12 13 14 15

//		int i = 5;
//		while( i <= 15 ){
//			System.out.print(i + " ");
//			i++;
//		}
//		System.out.println();


		// TODO: Create a do-while loop that will count by 2's starting with 0 and ending at 100.
		//  Follow each number with a new line.
		// TODO: Alter your loop to count backwards by 5's from 100 to -10.

////		int i = 0;
//		int i = 100;
//		do {
//			System.out.println(i);
////			i += 2;
//			i -= 5;
////		} while(i <= 100);
//		} while(i >= -10);


		// TODO: Create a do-while loop that starts at 2.
		//  displays the number squared on each line while the number is less than 1,000,000.
		/*  Output should equal:
			2
			4
			16
			256
			65536
		*/

//		int i = 2;
//		do {
//			System.out.println(i);
//			i *= i;
//			if(i == 0){
//				break;
//			}
//		} while(i <= 1000000);


		// TODO: Refactor the previous two exercises to use a for loop instead.

////		for(int i = 0; i <= 100; i+=2){
//		for(int i = 100; i >= -10; i-=5){
//			System.out.println(i);
//		}


		// TODO: Recreate FizzBuzz

//		for (int i = 1; i <= 30; i++) {
//			if (i % 15 == 0) {
//				System.out.println("FizzBuzz");
//			} else if (i % 3 == 0) {
//				System.out.println("Fizz");
//			} else	if (i % 5 == 0) {
//				System.out.println("Buzz");
//			} else {
//				System.out.println(i);
//			}
//		}


		// TODO: Prompt the user to enter an integer.
		// TODO: Display a table of squares and cubes from 1 to the value entered.
		// TODO: Ask if the user wants to continue.
		// TODO: Assume that the user will enter valid data.
		// TODO: Only continue if the user agrees to.
		/*  Example Output:
			What number would you like to go up to? 5

			Here is your table!

			number | squared | cubed
			------ | ------- | -----
			1      | 1       | 1
			2      | 4       | 8
			3      | 9       | 27
			4      | 16      | 64
			5      | 25      | 125
		*/

		Scanner userInput = new Scanner(System.in);

		System.out.println("What number would you like to go up to?");
		int userInt = userInput.nextInt();

		System.out.println("Here is your table!");
		System.out.println();
		System.out.println("number | squared | cubed");
		System.out.println("------ | ------- | -----");

		for (int i = 1; i <= userInt; i++){
			int squared = i * i;
			int cubed = squared * i;
			System.out.printf("%6d | %7d | %5d%n", i, squared, cubed);
		}
		System.out.println();


		// TODO: Prompt the user for a numerical grade from 0 to 100.
		// TODO: Display the corresponding letter grade.
		// TODO: Prompt the user to continue.
		// TODO: Assume that the user will enter valid integers for the grades.
		// TODO: The application should only continue if the user agrees to.
		/*  Grade Ranges:
			A : 100 - 88
			B : 87 - 80
			C : 79 - 67
			D : 66 - 60
			F : 59 - 0
		*/
		while(true){
			System.out.println("Please enter a numerical grade from 0 to 100.");
			int userGrade = userInput.nextInt();

			if (userGrade <= 100 && userGrade >= 88) {
				System.out.println("Your grade is: A");
			} else if (userGrade <= 87 && userGrade >= 80) {
				System.out.println("Your grade is: B");
			} else if (userGrade <= 79 && userGrade >= 67) {
				System.out.println("Your grade is: C");
			} else if (userGrade <= 66 && userGrade >= 60) {
				System.out.println("Your grade is: D");
			} else if (userGrade <= 59 && userGrade >= 0) {
				System.out.println("Your grade is: F");
			} else {
				System.out.println("You have entered an in invalid grade.");
			}
			System.out.println();

			System.out.println("Would you like to continue? Please answer \"yes\" or \"no\"");
			String userAnswer = userInput.next();

			while (!userAnswer.equalsIgnoreCase("yes") && !userAnswer.equalsIgnoreCase("no")) {
				System.out.println("That is not a valid answer. Please answer \"yes\" or \"no\"");
				userAnswer = userInput.next();
			}
			if (userAnswer.equalsIgnoreCase("yes")) {
				System.out.println("You have chosen to continue.");
				System.out.println();
			} else {
				System.out.println("You have chosen not to continue.");
				break;
			}
		}

	}

}

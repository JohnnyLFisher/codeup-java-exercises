package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayLec {
	// Let's have some fun with arrays!

	public static void main(String[] args) {

		/* ***************   ******** ********************* */
		/* ******** WORKING WITH ARRAY ELEMENTS *********** */
		/* ************* ITERATING ARRAYS ***************** */
		/* ***************   ******** ********************* */

		// TODO: 1. Declare an int array called numbers without populating it
		int[] numbers;
		//       2. Declare a String array called words with a length of 10
		String[] words = new String[10]; // using a 'literal' (10)
		//       3. Initialize an int array called temps with the 'array initializer syntax'
		int[] temps = {34, 31, 56, 89, 75}; // int array with 5 elements
//		System.out.println(temps.length);


		// TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
		//       2. Using an advanced for, iterate through the temps array and print each temp on a new line
		//       3. Re-assign the third element with a temp of 38
		//       4. Print "Updated third temp: 38" to the console, using printf
		for( int i=0; i < temps.length; i++ ) {
//			System.out.println(temps[i]);
		}
		for (int temp : temps) {
			// the 'temp' interger will hold the current tempurature of each iteration (of the for loop)
//			System.out.println(temp);
		}
		temps[2] = 38;
//		System.out.printf("Updated third temp: %d\n", temps[2]);


		// TODO: 1. Create a string called 'horns', populated with 4 values, using array initializer syntax
		//       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"
		String[] horns = {"Yamaha", "Conn", "Schmid", "Holton"};
		Random randomizer = new Random();
		int randInt = randomizer.nextInt(4); // generate random int between 0 and 3
		System.out.println(horns[randInt] + " is the best manufacturer!");



		/* ***************   ******** ********************* */
		/* ********* **** THE ARRAYS CLASS **** *********** */
		/* **************** 2D ARRAYS ********************* */
		/* ***************   ******** ********************* */

		// TODO: 1. Create an 'Instructor' class that stores an instructor's
		//           -- firstName
		//           -- lastName
		//           -- brainWaveFrequency
		//        -- Also, keep a count of the total number of instructors
		//       2. Print to the console when an instructor has been created
		//       3. Create Getters and Setters for names / brainwavefreq
		//       4. Create a method to display instructor stats
		//       5. Initialize an array full of instructor objects

		// define a constant, that will be the total number of instructors
		final int KALYPSO_TEAM = 3;

		// we can instantiate an array that holds (almost) and data type
		Instructor[] team = new Instructor[KALYPSO_TEAM];

		//       6. Instantiate three instructors (casey,vivian,trant)
		Instructor casey = new Instructor("Casey", "Friday");
		Instructor daniel = new Instructor("Daniel", "Fryar");
		Instructor fernando = new Instructor("Fernando", "Mendoza");

		//       7. Set each instructor's BrainWaveFrequency
		casey.setBrainWaveFrequency(4600000); //4.6 GHz
		daniel.setBrainWaveFrequency(12); // 12 Hz
		fernando.setBrainWaveFrequency(800); // 800 Hz

		//       8. Add those instructors in the Instructor object array
		team[0] = casey;
		team[1] = daniel;
		team[2] = fernando;

		//       9. Iterate through the Instructor object array, and display each instructor's stats
		for (int i=0; i < team.length; i++) {
			System.out.println(team[i].displayStats());
		}
		System.out.println();

		for (Instructor single : team){
			System.out.println(single.displayStats());
		}
		System.out.println();

		//       10. Create an array with only first names in it, and display it to the console
		String[] firstNames = new String[team.length];

		for (int i=0; i < team.length; i++){
			// add each instructor's firstName to the 'firstNames' String array
			firstNames[i] = team[i].getFirstName();
		}
		for (String name : firstNames){
			System.out.println(name);
		}
		// More clever way to display the first names?
		System.out.println(Arrays.toString(firstNames));

		//       11. Sum the brainwave frequencies, and display the total to the console
		int brainFreqSum = 0 ;
		for (Instructor single : team){
			brainFreqSum += single.getBrainWaveFrequency();
		}
		double newFreqSum = brainFreqSum + 0.0;
		// %d ~ "digits", like intergers/whole numbers
		// %f ~ "float", decimal numbers hiegher precision
		System.out.printf("Total Instructor Brainpower: %f MHz\n", newFreqSum/1000);

		//       12. Create a 2D array, and print it to the console, in grid form
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		for (int[] row : matrix) {
			System.out.println("+---+---+---+");

			System.out.print("| ");

			for (int n : row) {
				System.out.print(n + " | ");
			}

			System.out.println();
		}

		System.out.println("+---+---+---+");

	}
}
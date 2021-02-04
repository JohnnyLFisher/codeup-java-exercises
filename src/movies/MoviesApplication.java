package movies;

import util.Input;

public class MoviesApplication {

	// public static Movie[] allMovies; // property of the class (if you want to do it this way)

	public static void main(String[] args) {
		// Use the Input class to grab a choice from the user:
		Input userInput = new Input();
		int userChoice = 0;
		Movie[] allMovies = MoviesArray.findAll();
		// allMovies = MoviesArray.findAll(); // if we wanted to use this as a static property of the class, could set it this way
		do {
			userChoice = userInput.getInt("What would you like to do?\n" +
					"\n" +
					"0 - exit\n" +
					"1 - view all movies\n" +
					"2 - view movies in the animated category\n" +
					"3 - view movies in the drama category\n" +
					"4 - view movies in the horror category\n" +
					"5 - view movies in the scifi category\n" +
					"6 - view movies in the musical category\n" +
					"\n" +
					"Enter your choice: ");

			// a way to show all movies
			switch (userChoice) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					showMovies(userChoice, allMovies);
				case 0:
					break;
				default:
					System.out.println("That was not a valid choice!");

			}

		} while (userChoice != 0);

		System.out.println("Thank you for playing!");
	}

	public static void showMovies(int category, Movie[] allMovies) {
		String categoryName = "";

		for (Movie thisMovie : allMovies) {
			switch (category) {
				case 1: // "all"
					System.out.println(thisMovie.getName());
					break;
				case 2: // "animated"
					System.out.print(thisMovie.getCategory().equals("animated") ? thisMovie.getName()+"\n" : "");
					break;
				case 3: // "drama"
					System.out.print(thisMovie.getCategory().equals("drama") ? thisMovie.getName()+"\n" : "");
					break;
				case 4: // "horror"
					System.out.print(thisMovie.getCategory().equals("horror") ? thisMovie.getName()+"\n" : "");
					break;
				case 5: // "scifi"
					System.out.print(thisMovie.getCategory().equals("scifi") ? thisMovie.getName()+"\n" : "");
					break;
				case 6: // "musical"
					System.out.print(thisMovie.getCategory().equals("musical") ? thisMovie.getName()+"\n" : "");
					break;
			}

		}

	}
}
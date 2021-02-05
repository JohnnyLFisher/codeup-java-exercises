package lecturesAndExamples.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
	public static void main(String[] args) {

		// *************************************************** //
		// ********* ArrayList and its Methods *************** //
		// *************************************************** //

		// 1. Initialize an ArrayList of Strings, called roasts
		//   add light, medium, medium, dark to the array list, one at a time
		ArrayList<String> roasts = new ArrayList<>();
		roasts.add("light"); // similar to Javascript ".push()"
		roasts.add("medium");
		roasts.add("medium");
		roasts.add("dark");

		System.out.println(roasts); // [light, medium, medium, dark]

		// 2. Check to see if the list contains "dark" , and then "espresso"
		boolean result;
		result = roasts.contains("dark");
		System.out.println( result ? "Contains dark!" : "Does not contain dark!");
		result = roasts.contains("espresso");
		System.out.println( result ? "Contains espresso!" : "Does not contain espresso!");

		// 3. Find the last index of "medium" in the array
		int index = roasts.lastIndexOf("medium");
		System.out.println("The last index of 'medium' is: " + index);

		// 4. Check if the array list is empty
		if(roasts.isEmpty()) { // true -> the list is empty, false -> there's stuff in it
			// if this conditional runs, that means the list is empty
			System.out.println("The roasts list is empty!");
		} else {
			System.out.println("The roasts list is NOT empty! Java FTW");
		}
		System.out.println(roasts.isEmpty() ? "01 List is empty" : "01 List is NOT empty");


		// 5. Assign the array list an empty ArrayList object, and then check if empty
		roasts = new ArrayList<>();
		System.out.println(roasts.isEmpty() ? "02 List is empty" : "02 List is NOT empty");


		// 6. Remove the espresso roast
		roasts.add("light");
		roasts.add("light");
		roasts.add("medium");
		roasts.add("medium");
		roasts.add("dark");
		roasts.add("espresso"); // [light, light, medium, medium, dark, espresso]
		System.out.println("Original roasts: " + roasts);

		roasts.remove("light");
		System.out.println("Roasts now loos like: " + roasts);


		// If we wanted to remove every instance of "light"
		boolean keepGoing = true;
		while (keepGoing) {
			if (roasts.contains("light")) {
				roasts.remove("light");
			} else {
				keepGoing = false;
			}
		}

		System.out.println("After our 'light' removal, roasts: " + roasts);

		// 7. Remove the element at index 2
		roasts.remove(2);
		System.out.println("After removing index 2, roast = " + roasts);


		// *************************************************** //
		// ********* Hash Maps and their Methods ************* //
		// *************************************************** //

		// 1. Create a HashMap called usernames that contains:
		//   a. first name // String
		//   b. Github username // String
		HashMap<String, String> usernames = new HashMap<>();
		// put ssome data in the hashmap
		usernames.put("Casey", "fridaynext");
		usernames.put("Daniel", "danielfryar");
		usernames.put("Fernando", "fmendoza");

		System.out.println(usernames);


		// 2. re-initialize the HashMap using the .clear() method
		usernames.clear();

		// 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
		usernames.put("Casey", "fridaynext");

		// 4. use the .putIfAbsent() method to add 
		//   a. "Vivian" -> "viviancan"
		//   b. "Casey" -> "XpenguinX"
		usernames.putIfAbsent("Daniel", "danielfryar");
		usernames.putIfAbsent("Casey", "fridaynext");
		System.out.println(usernames);

		// 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
		// the key "Casey" was present, so we did no add that key/value pair with XpenguinX
		// the key "Daniel" was absent, so we added that key/value pair to the HashMap

		// 6. Use the .remove() method to remove "Casey"
		usernames.remove("Casey");
		System.out.println(usernames);

		// 7. Use the .replace() method to change Daniel's username to "danielfryardev"
		usernames.replace("Daniel", "danielfryardev");
		System.out.println(usernames);

		// Change the key for "Daniel
		String danielValue = usernames.get("Daniel");
		usernames.remove("Daniel");
		usernames.put("Daniel", danielValue);

		System.out.println("After changing the value for daniel" + usernames);

		// 8. Use the .clear() method to clear the map
		// 9. Use the .isEmpty() method to verify that it was cleared
		usernames.clear(); // this should empty the HashMap
		System.out.println(usernames.isEmpty() ? "HashMap EMPTY!" : "HashMap NOT empty!");


	}
}
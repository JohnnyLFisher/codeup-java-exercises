import java.util.Arrays;

public class ArraysExercises {
	public static void main(String[] args) {

		Person pam = new Person("Pam");
		Person jim = new Person("Jim");
		Person creed = new Person("Creed");

		Person[] people = {pam, jim, creed};

		Person dwight = new Person("Dwight");

		System.out.println(Arrays.toString(addPerson(people, dwight)));

	}

	public static Person[] addPerson(Person[] people, Person person) {

		Person[] newPeople = new Person[people.length + 1];

		for (int i = 0; i < newPeople.length - 1; i++) {
			newPeople[i] = people[i];
			System.out.println("Adding " + people[i].nickname + " to the newPeople array.");
		}
//		System.arraycopy(people, 0, newPeople, 0, newPeople.length); //This is the way Intellij did it

		newPeople[people.length] = person;
		System.out.println("Adding " + person.nickname + " to the newPeople array.");
		System.out.println("The last person in the new array is: " + newPeople[people.length].nickname);


		return newPeople;
	}

}

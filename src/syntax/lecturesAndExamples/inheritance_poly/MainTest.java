package syntax.lecturesAndExamples.inheritance_poly;

public class MainTest {
	public static void main(String[] args) {

		Employee[] codeup = new Employee[2];

		Person fer = new Person("Fer");
		fer.sayHello();

		Employee sophie = new Employee("Sophie");
		codeup[0] = sophie;
		sophie.sayHello();

		Employee dimitri = new Manager("Dimitri");
		codeup[1] = dimitri;

		for (Employee e: codeup) {
			e.doWork();
		}

		SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

		System.out.println(theManOfSteel.getName()); // "Superman"
		System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"




	}
}

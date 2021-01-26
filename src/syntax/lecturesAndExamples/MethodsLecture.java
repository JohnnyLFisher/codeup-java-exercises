package syntax.lecturesAndExamples;

public class MethodsLecture {
	// Method Structure
	public static int addNumbers(int num1, int num2) {
		return num1 + num2; // because the type is "int" - this method must return an "int"
	}

	public int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	public void greetings() {
		// void methods can be static or non-static - main point is that they will NOT have to return anything
		System.out.println("Hello, to you!");
		// this is not returning anything
	}

	public static void main(String[] args) {
		// This main method can be seen as separate from the syntax.lecturesAndExamples.MethodsLecture class, so we need to instantiate all variables
		//   again, that we want to use in logical calculations here

		// Let's add 2 numbers.

		// Static
		int sum = MethodsLecture.addNumbers(2, 2);
		System.out.println("Using our static method: ");
		System.out.println(sum);

		double squaredNumber = Math.pow(3, 2);

		// Math caseyMathMagic = new Math();

		// Non-static
		MethodsLecture mathWiz = new MethodsLecture();
		mathWiz.greetings();
		int difference = mathWiz.subtractNumbers(10, 6); // num1 - num2
		System.out.println("Using a non-static method: ");
		System.out.println(difference);

		System.out.println(MethodsLecture.tenureMessage("Casey", "PHP", 11));
		System.out.println(MethodsLecture.tenureMessage("Daniel", "Java", 15));
		System.out.println(MethodsLecture.tenureMessage("Fernando", "PHP", 30));

		System.out.println(MethodsLecture.tenureMessage("Casey", "Java"));
		System.out.println(MethodsLecture.tenureMessage("Go"));

		MethodsLecture.sayHello("Bonjour", "Jean Luc");

		// ******* Calling our recursion method ***************//
		MethodsLecture.count(5);

		// ******* Calling our second recursion method ***************//
		System.out.println(MethodsLecture.getPower(6, 3));
		System.out.println(MethodsLecture.getPowerRecursive(3, 5));

		// String thisMessage = syntax.lecturesAndExamples.MethodsLecture.tenureMessage("Java", 20);
	} // END: psvm

	// Doing an exponent (i.e. 3 ^ 2 = 9) using a for loop
	public static long getPower(int base, int exponent) { // 1. getPower(6, 3)
		long result = 1;
		for (int i = 1; i <= exponent; i++) {
			result = result * base; // 1. res = 1 * 6;
			// 2. res = 6 * 6;   (36)
			// 3. res = 36 * 6;  (216)
		}
		return result;
	}

	// Doing an exponent using RECURSION
	public static long getPowerRecursive(int base, int exponent) { // 1. getPowerRecursive(6, 3)  -- goal: 6 * 6 * 6
		if (exponent == 0) {
			return 1; // any number to the power of 0 is equal to 1
		} else if (exponent == 1) {
			return base; // any number to the power of 1 is equal to itself
		} else if (exponent == 2) {
			return base * base;
		}
		return base * getPowerRecursive(base, exponent - 1);  // we want to do 3 ^ 5, i.e. getPowerRecursive(3, 5)

		// 1. return 3 * getPowerRecursive(3, (5-1)), i.e. getPowerRecursive(3, 4)
		// 2. return 3 * ( 3 * getPowerRecursive(3, (4-1)) ), i.e. getPowerRecursive(3, 3)
		// 3. return 3 * ( 3 * ( 3 * ( getPowerRecursive(3, (3-1)) ) , i.e. getPowerRecursive(3, 2)
		//  3.a) return 3 * ( 3 * ( 3 ) ) ) * 3 * 3;
		///  = 3 * 3 * 3 * 3 * 3
		///  = 3 ^ 5 = 243
	}

	// start of tenureMessage
	public static String tenureMessage(String name, String progLang, int numYears) {
		// String thePersonName = name;
		// String codingLanguage = progLang;
		// int totalTime = numYears;

		return name + " has been coding " + progLang + " for " + numYears + " years.";
		// return "X has done Y for Z years";
	}

	// ****************** METHOD OVERLOADING ****************** //
	public static String tenureMessage(String name, String progLang) {
		return name + " is super good at " + progLang;
	}

	public static String tenureMessage(String progLang) {
		return "Somebody is sure to be good at " + progLang;
	}

	// version 1
	public static void sayHello(int times) {
		for (int i = 0; i < times; i += 1) {
			sayHello(); // calling sayHello()
		}
	}
	// clever version1
	// public static void sayHello(int rotations) {
	//     // this will not work, because we already have a version that takes in 1 integer
	// }
	// version 2
	public static void sayHello() {
		sayHello("Hello", "World"); // calling sayHello(String1, String2)
	}
	// version 3
	public static void sayHello(String name) {
		sayHello("Hello", name);
	}
	// version 4
	public static void sayHello(String greeting, String name) {
		System.out.println(greeting + ", " + name + "!");
	}

	// ******************** RECURSION *********************** //
	public static void count(int n) { // 1. syntax.lecturesAndExamples.MethodsLecture.count(5)    -- from the PSVM
		if (n <= 0) {
			System.out.println("All done!");
			return;
		}
		System.out.println(n);
		count(n - 1); // 2. count(5-1), i.e. count(4)
		// 3. count(4-1), i.e. count(3)
		// 4. count(3-1), i.e. count(2)
		// 5. count(2-1), i.e. count(1)
		// 6. count(1-1), i.e. count(0)
	}



}
package syntax;

public class SyntaxLecture {

	// psvm - InrelliJ shortcut for the follosing method signature
	public static void main(String[] args) {

		// ================== STATEMENTS (s-3)

		// Statements may be...
		// Declarations
		int number; // we have initialized
		number = 7; // = is just assignment in Java

		// keyboard shortcut for formatting code is CMD-option-l

		// Assignment expressions


		// Any use of ++ or --
		// pre-increment
		--number; // this will be decremented BEFORE it's evaluated
		System.out.println("The number's value after pre-decrementing is: " + number);
		number++; // this will be incremented AFTER it's evaluated on this line
		System.out.println("The number's value after post-incrementing is: " + number);

		System.out.println("Pre-decrementing " + number + " = " + --number);
		System.out.println("Post-incrementing " + number + " = " + number++);
		// NOW the number is incremented from what it was before to 1 larger
		System.out.println("Now, the number = " + number);


		// Method invocations
		Math.random(); // call the "random()" method, from the Math class.

		// say we wanted to assign a random number to a variable
		// number = Math.random(); // this doesn't work because 'number' is of type 'int' and Math.random() returns a 'double'
		double randomNumber = Math.random();

		// Object creation expressions



		// ================== COMMENTS (s-4)
		/**
		*
		* This is a multi line comment
		*
		**/

		// this is a single line comment

		/* this is ALSO a single line comment*/

		// see JavaDocTest in docs package


		// ================== DATA TYPES (s-5, 6, 7)


		// use the smallest type needed for the job

		// primitive types...

		byte age = 125;
		System.out.println("Adding one to the byte(125) : " + ++age);
		System.out.println("Adding one to the byte(126) : " + ++age);
		System.out.println("Adding one to the byte(127) : " + ++age);
		// age = 200;

		System.out.println(age);
		short minimumAnnualSalary = 32765;
		System.out.println("Adding one to the minimumAnnualSalary(32765) : " + ++minimumAnnualSalary);
		System.out.println("Adding one to the minimumAnnualSalary(32766) : " + ++minimumAnnualSalary);
		System.out.println("Adding one to the minimumAnnualSalary(32767) : " + ++minimumAnnualSalary);
		int distanceToSaturn = 1200000000;
		long numberOfHumanCells = 3000000000L; // L needed for compiler

		// to access something at the index 1 of a darabase, using longs
		// books[1L]

		System.out.println(numberOfHumanCells);
		float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
		System.out.println(lengthOfBacteriaInInches);
		double widthOfAtomInMeters = .00000000001;
		char seatingSection = 'M'; // must wrap in single quotes
		boolean everythingIsAwesome = false;
		everythingIsAwesome = true;
		// !everythingIsAwesome; // this would invert everythingIsAwesome
		if(everythingIsAwesome){
			System.out.println("Everything is Awesome!");
		}
		if(!everythingIsAwesome){
			System.out.println("Everything is NOT Awesome!");
		}
		// strings (not a primitive type)

		// reference type data refers to a location in memory, holding the contents of that variable
		String thisIsAString = "Hello";
		String anotherString = "Hello";

		if(thisIsAString == anotherString) {
			System.out.println("The two are equal, from double equals.");
		}
		// correct way to write the above conditional check
		if(thisIsAString.equals(anotherString)){
			System.out.println("The two are equal, from double equals.");
		}
		if(thisIsAString == "Hello"){
			System.out.println("Two are equal comparing reference string to hello");
		}
		// correct way to write the above conditional check
		if(thisIsAString.equals("Hello")){
			System.out.println("We have a match for Hello, using .equals");
		}




		// like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
		System.out.println("Hello\nWorld");
		System.out.println("Hello");
		System.out.println("World");

		// want to system out something like Hello, "groovy" world
		System.out.println("Hello, \"groovy\" world");

		char someLetter = 'Y';
		System.out.println(someLetter);
		// if you system out, and the console shows a result of ~ @4325345

		// Let's create a string and then system out the first character in that string
		String myName = "Johnny";
		System.out.println(myName.charAt(0));
		System.out.println(myName.offsetByCodePoints(0,3));



		// ================== VARIABLES (s-8)

		// declaration separate from initialization
		int faveNumber; // declared the variable
		faveNumber = 42;

		// declaration and initialization
		int myFaveNumber = 42;

		// ================== IDENTIFIERS AND KEYWORDS (s-9)

		// do not name variables with reserved words
		// String if = "Johnny"; // 'if' is a reserved word, so can't call a variable 'if'

		// see curriculum


		// ================== CONSTANTS (s-10)

		// see curriculum
		final double CIV_MAX_DOLLARS = 2147483647;
		// try to change it
		// CIV_MAX_DOLLARS = 3; // this doesn't work, since we can not modify a 'final' variable

		// ================== EXPRESSIONS (s-11)

		// basically the same as JS
		int firstValue = 97;
		int secondValue = 99;

		int sumOfValues = firstValue + secondValue;
		int deltaValues = firstValue - secondValue;
		int product = firstValue * secondValue;
		int quotient = firstValue / secondValue;

		// ================== OPERATORS (s-12)

		// basically the same as JS
		int reverseNumber = -72;
		int oppositeDay = -reverseNumber;
		int bePositive = +reverseNumber;


		// ================== ASSIGNMENT STATEMENTS (s-13)

		// basically the same as JS


		// ================== CASTING (s-14)

		// Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


		// IMPLICIT
		short x = 8;
		int y = x;

		// EXPLICIT
		int civDollars =  20999998;
		byte civSandwich = (byte) civDollars;
		System.out.println("Making a nice civ sandwich: " + civSandwich);

		// implicit casting - less to more precise (widening)

		float num1 = 2.22F;
		double num2 = num1; // implicitly being converted


		// explicit casting - more to less explicit casting (narrowing)

		double num3 = 3.1;
		float num4 = (float) num3;
		//
		// System.out.println(num4);

	}

}

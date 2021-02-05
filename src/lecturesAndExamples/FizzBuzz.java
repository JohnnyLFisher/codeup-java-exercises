package lecturesAndExamples;

public class FizzBuzz {

	static void fizzBuzzFor(int num) {
		for (int i = 1; i<=num; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else	if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

	static void fizzBuzzWhile(int num) {
		// initialize i
		int i = 1;
		// while i less than num
		while (i <= num) {
			// if i div by 15 output FizzBuzz
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else
				// if i div by 3 output Fizz
				if (i % 3 == 0) {
					System.out.println("Fizz");
				} else
					// if i div by 5 output Buzz
					if (i % 5 == 0) {
						System.out.println("Buzz");
					} else {
						System.out.println(i);
					}
			// increment i
			i++;
		}
	}

	public static void main(String[] args) {
		int n = 30;
		fizzBuzzFor(n);
	}
}

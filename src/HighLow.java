import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HighLow {

	public static void test() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a guess:");
			String answer = input.nextLine();
			int num = Integer.parseInt(answer);

			if (num > randomNum) {
				System.out.println("LOWER");
			} else if (num < randomNum) {
				System.out.println("HIGHER");
			} else {
				System.out.println("GOOD GUESS");
				break;
			}
		}
	}

	public static void main(String[] args) {
	test();
	}

}

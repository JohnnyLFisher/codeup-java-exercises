import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {
	public static String[] adjectives = {
			"overjoyed",
			"receptive",
			"electric",
			"endurable",
			"adjoining",
			"present",
			"future",
			"enchanting",
			"nifty",
			"dusty"
	};
	public static String[] nouns = {
			"picture",
			"walk",
			"writing",
			"recess",
			"bite",
			"account",
			"calendar",
			"baseball",
			"reaction",
			"club",
	};

	public static void main(String[] args) {

		int rand1 = ThreadLocalRandom.current().nextInt(0, 9 + 1);
		int rand2 = ThreadLocalRandom.current().nextInt(0, 9 + 1);

		String rAdjective = adjectives[rand1];
		String rNoun = nouns[rand2];

		System.out.println("Here is your server name:");
		System.out.println(rAdjective + "-" + rNoun);

	}
}

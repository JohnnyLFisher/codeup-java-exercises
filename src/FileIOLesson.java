import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("languages.txt");
		if (!Files.exists(filePath)) {
			Files.createFile(filePath);
		}

		List<String> languages = Arrays.asList(
				"HTML",
				"CSS",
				"JavaScript",
				"Java"
		);
		Files.write(filePath, languages);

		Files.write(
				filePath,
				Arrays.asList("MySQL"), // list with one item
				StandardOpenOption.APPEND
		);

		List<String> lines = Files.readAllLines(filePath);

		for (String line : lines) {
			System.out.println("A language I learned is " + line + ".");
			if (line.equals("JavaScript")){
				System.out.println("This is my favorite language!");
			}
		}

	}
}

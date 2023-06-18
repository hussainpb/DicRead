package dictreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static String readFile(String filePath) throws IOException {
		StringBuilder content = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}
		}

		return content.toString();
	}

	public static void main(String[] args) throws IOException {
		String filePath = "resources//dict.txt";
		FileExistenceChecker fec = new FileExistenceChecker();
		if (fec.doesFileExist(filePath)) {
			String fileContent = readFile(filePath);
			String[] line = fileContent.split("\n");
			for (String s : line) {
				String[] Word = s.split("-");
				System.out.println(Word[0]);
				if (Word[1].contains(", ")) {
					String[] values = Word[1].split(", ");
					System.out.println(values[0]);
					System.out.println(values[1]);
				} else {
					System.out.print(Word[1]);
				}
			}
		}
	}
}

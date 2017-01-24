package exampleProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LetterCounter {

	public int countLetters(String testString) {
		int totalLetters = 0;
		for (Character chara : testString.toCharArray()) {
			if (Character.isLetter(chara))
				totalLetters++;
		}
		return totalLetters;
	}

	public int countLettersInFile(String fileName, int lineNumber) throws IOException {
		

		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
		int currentLineNumber = 1;
		String line = "";
		String currentLine;
		while ((currentLine = bufferedReader.readLine()) != null) {
			if (currentLineNumber == lineNumber) line = currentLine;
			currentLineNumber++;
		}
		bufferedReader.close();
		int total = countLetters(line);
		return total;
	}

}

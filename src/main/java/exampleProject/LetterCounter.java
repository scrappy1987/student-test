package exampleProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCounter {
	//Compile regex pattern
	Pattern pattern = Pattern.compile("[a-zA-Z]");
	
	/**
	 * Counts the number of letters on a given line number from the pom.xml file
	 * 
	 * @param lineNumber to count letters from in the pom file
	 * @return number of letters on the specified line of the pom.xml file
	 * @throws IOException
	 */
	public int countLetters(int lineNumber) throws IOException, IndexOutOfBoundsException {
		// Initialise result holder
		int result = 0;
		// Get the string to pattern match from pom.xml by specified line number
		Matcher m = pattern.matcher(Files.readAllLines(Paths.get("pom.xml")).get(lineNumber));
		// While there are still matches increment match number
		while (m.find())
			result++;
		// return letters founds
		return result;
	}

}

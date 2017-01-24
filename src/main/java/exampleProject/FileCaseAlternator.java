package exampleProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class FileCaseAlternator {

	public void alternateCase(String filename) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				filename));
		String currentLine;
		int lineNumber = 1;

		while ((currentLine = bufferedReader.readLine()) != null) {
			if (lineNumber % 2 == 0)
				currentLine = StringUtils.upperCase(currentLine);
			else currentLine = StringUtils.lowerCase(currentLine);
			System.out.println(currentLine);
			lineNumber++;

		}
		
		bufferedReader.close();
	}
}

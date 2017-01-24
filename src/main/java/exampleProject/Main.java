package exampleProject;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String input = "C:\\Users\\Administrator\\Desktop\\Joe\\lines.txt";
		FileCaseAlternator fCA = new FileCaseAlternator();
		
		try {
			fCA.alternateCase(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

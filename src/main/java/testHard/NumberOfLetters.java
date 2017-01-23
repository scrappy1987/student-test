package testHard;

import java.io.*;

public class NumberOfLetters {
	
	//int[] individualLineCount;
	
	/*Takes in line number and then counts the letters in that line
	 * and return the total count.
	 */
	public int count(int lineNum) throws IOException {
		
		BufferedReader bufferIn = new BufferedReader(new FileReader("linecount.txt"));
		
		String line ="";
		String actualLine = "";
		int count = 0;
		
		while ((line = bufferIn.readLine()) != null) {

			//finds the right line entered by user
			count++;
			if (count == lineNum) {
				actualLine = line;
				//break when we find it
				break;
			}
			
			//String[] lines = line.split("(?!^)");
		}
		
		//count the characters in the given line
		String newString = actualLine.replaceAll("[^a-zA-Z]", "");
		
		//return length of string
		return newString.length();
	}


}

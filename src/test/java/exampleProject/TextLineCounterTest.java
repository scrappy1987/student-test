package exampleProject;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class TextLineCounterTest {

	/**
	 * Ingests a text file into an array list
	 * @result the array list would be the size of the amount of lines in the text file.
	 */
	@Test
	public void IngestTest() {
		TextLineCounter textCount = new TextLineCounter();
		ArrayList<String> FileContents = new ArrayList<String>(); 	
		
		FileContents = textCount.IngestTextFile();
		
		assertEquals("",7, FileContents.size()); // supplied file has 7 lines inside
	}
	
	/**
	 * The amount of characters in a line is correctly counted
	 * 
	 * @result As Above. 97 characters is the expected answer for first line.
	 */
	@Test
	public void CountLineTest(){
		TextLineCounter textCount = new TextLineCounter();
		
		int lineCount = textCount.CountLineLetters(1); // Specified to use first line of text file
	
		assertEquals("No",97, lineCount); // 97 is the expected amount of chars on first line
	}
}

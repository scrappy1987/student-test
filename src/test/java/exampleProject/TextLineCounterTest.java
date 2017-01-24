package exampleProject;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

/**
 * @author      Chris Doodson
 * @author 		Russell Claxton
 * @version     1.0          (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class TextLineCounterTest {

	private static final Logger LOGGER = Logger.getLogger( TextLineCounter.class.getName() );
	
	@Test
	public void IngestTest() {
		TextLineCounter textCount = new TextLineCounter();
		ArrayList<String> fileContents = new ArrayList<String>(); 	
		
		try {
			fileContents = textCount.IngestTextFile();
		} catch (FileNotFoundException e) {
			LOGGER.log( Level.SEVERE, e.toString(), e );
		}
		
		assertEquals("",7, fileContents.size()); // supplied file has 7 lines inside
	}
	
	@Test
	public void CountLineTest(){
		TextLineCounter textCount = new TextLineCounter();
		
		int lineCount = 0;
		try {
			lineCount = textCount.CountLineLetters(1);
		} catch (FileNotFoundException e) {
			LOGGER.log( Level.SEVERE, e.toString(), e );
		} // Specified to use first line of text file
	
		assertEquals("No",97, lineCount); // 97 is the expected amount of chars on first line
	}
}

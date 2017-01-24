package exampleProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author      Chris Doodson
 * @author 		Russell Claxton
 * @version     1.0          (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class TextLineCounter {

	private static final Logger LOGGER = Logger.getLogger( TextLineCounter.class.getName() );
	
	private String filePath = null;
	
	private ArrayList<String> fileContents = new ArrayList<String>();
	
	TextLineCounter (){
		filePath = "./HardTaskTest.txt"; // default path to file		
	}
	
	TextLineCounter (String fPath){
		filePath = fPath;
	}
	
	/**
	 * Finds text file and ingests its contents into 
	 * an array list on a line by element basis.
	 * @throws FileNotFoundException 
	 */
	public ArrayList<String> IngestTextFile() throws FileNotFoundException {
		Scanner s = new Scanner(new File(filePath));
		
		try{			
			while (s.hasNextLine()){
				fileContents.add(s.nextLine());
			}
		}
		catch(Exception e){
			LOGGER.log( Level.SEVERE, e.toString(), e );
		}
		finally{
			s.close();
		}		
		return fileContents;
	}
	
	/**
	 * Reads the file into AL, attains specific line, regex on line to remove 
	 * whitespace and unwanted characters and then counts characters
	 */
	public int CountLineLetters(int lineNo) throws FileNotFoundException { // -1 on line
		fileContents = IngestTextFile();
		String textLine = fileContents.get(lineNo-1); 
		textLine = textLine.replaceAll("[^A-Za-z]+", "");
		
		return textLine.length();
	}	
}







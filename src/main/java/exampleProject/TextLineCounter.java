package exampleProject;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author      Chris Doodson
 * @author 		Russell Claxton
 * @version     1.0          (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */
public class TextLineCounter {

	/**
	 * This String holds the file path to the text file.
	 */
	private String filePath = null;
	
	/**
	 * This ArrayList holds the contents of the textfile on a line per element basis..
	 */
	private ArrayList<String> FileContents = new ArrayList<String>();
	
	 /** 
	    * Class default constructor.
	 */
	TextLineCounter (){
		filePath = "./HardTaskTest.txt"; // default path to file		
	}
	
	/** 
	    * Class constructor with path String.
	*/
	TextLineCounter (String fPath){
		filePath = fPath;
	}
	
	/**
	 * Finds text file and ingests its contents into 
	 * an array list on a line by element basis.
	 *
	 */
	public ArrayList<String> IngestTextFile() {
		ArrayList<String> FileContents = new ArrayList<String>(); 	
		Scanner s = null;
		try{
			s = new Scanner(new File(filePath));
			
			while (s.hasNextLine()){
				FileContents.add(s.nextLine());
			}
		}
		catch(Exception e){
			System.out.println("Error reading from file.");
		}
		finally{
			s.close();
		}		
		return FileContents;
	}
	
	/**
	 * Reads the file into AL, attains specific line, regex on line to remove 
	 * whitespace and unwanted characters and then counts characters
	 * 
	 * TO-DO: add checks for invalid line number and bad arraylist after function.
	 *
	 * @param lineNo  Specifies the line to count letters of
	 */
	public int CountLineLetters(int lineNo) { // -1 on line
		ArrayList<String> FileContents = new ArrayList<String>();
		FileContents = IngestTextFile();
		String textLine = FileContents.get(lineNo-1); 
		textLine = textLine.replaceAll("[^A-Za-z]+", "");
		
		return textLine.length();
	}	
}







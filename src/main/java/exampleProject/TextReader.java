package exampleProject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextReader
{
	static FileReader flr;
	static BufferedReader bfr;
	
	public static int ReadLine(int i) throws IOException
	{
		flr = new FileReader("FileToRead.txt");
		bfr = new BufferedReader(flr);
		
		String out = "";
		int counter = 0;
		while(i != counter)
		{
			out = bfr.readLine();
			counter++;
		}

		System.out.println(out);
		return out.length();
	}
}

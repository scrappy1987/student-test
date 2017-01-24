package scripts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextReader
{
	public int readLine(int i) throws IOException
	{
		FileReader flr = new FileReader("FileToRead.txt");
		BufferedReader bfr = new BufferedReader(flr);
		
		String out = "";
		int counter = 0;
		while(i != counter++)
			out = bfr.readLine();

		System.out.println(out);
		bfr.close();
		flr.close();
		return out.length();
	}
}

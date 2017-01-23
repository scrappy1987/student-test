package exampleProject;
import static org.junit.Assert.*;

import java.io.IOException;

import exampleProject.TextReader;

import org.junit.Test;

public class TextReaderTest
{
	@Test
	public void test() throws IOException
	{
		int i = TextReader.ReadLine(1);
		assertEquals(i,4);
		i = TextReader.ReadLine(2);
		assertEquals(i,5);
		i = TextReader.ReadLine(3);
		assertEquals(i,6);
		i = TextReader.ReadLine(4);
		assertEquals(i,24);
	}
}

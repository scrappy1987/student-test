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
		TextReader r = new TextReader();
		int i = r.ReadLine(1);
		assertEquals(i,4);
		i = r.ReadLine(2);
		assertEquals(i,5);
		i = r.ReadLine(3);
		assertEquals(i,6);
		i = r.ReadLine(4);
		assertEquals(i,24);
	}
}

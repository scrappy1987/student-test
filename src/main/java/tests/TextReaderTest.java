package tests;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import scripts.TextReader;

public class TextReaderTest
{
	@Test
	public void test() throws IOException
	{
		TextReader r = new TextReader();
		int i = r.readLine(1);
		assertEquals(i,4);
		i = r.readLine(2);
		assertEquals(i,5);
		i = r.readLine(3);
		assertEquals(i,6);
		i = r.readLine(4);
		assertEquals(i,24);
	}
}

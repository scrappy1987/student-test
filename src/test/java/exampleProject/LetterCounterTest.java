package exampleProject;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class LetterCounterTest {
	LetterCounter lc = new LetterCounter();

	@Test
	public void test() {
		String testString = "Joe 1234567890 Blue Yellow Green!!!?";
		assertEquals(18,lc.countLetters(testString));
	}
	
	public void test2() throws IOException {
		int numLetters = lc.countLettersInFile("C:\\Users\\Administrator\\Desktop\\a.txt", 2);
		assertEquals(6,numLetters);
	}
	
	

}

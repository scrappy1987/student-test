package testHardJUnit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import testHard.NumberOfLetters;

public class NumberOfLettersTest {

	@Test
	public void numberTest() throws IOException {
		NumberOfLetters num = new NumberOfLetters();
		int counter = num.count(4);
		assertEquals(counter, 10);
		System.out.println("YOU GO GIRLSSSS!");
	}

}

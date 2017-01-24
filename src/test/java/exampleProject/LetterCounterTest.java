package exampleProject;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class LetterCounterTest {

	@Test
	public void testLetterCount() {
		try {
			assertEquals(22, new LetterCounter().countLetters(5));
		} catch (IOException e) {
			fail("IOException");
		}
		catch (IndexOutOfBoundsException e) {
			fail("IndexOutOfBoundsException");
		}
	}

}

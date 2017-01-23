package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void reverseTest() {
		Reverser rev = new Reverser();

		int[] nameOfArray = { 2, 4, 5, 7, 8, 4 };

		int[] reversedArray = rev.reverse(nameOfArray);

		int[] actualReversedArray = { 4, 8, 7, 5, 4, 2 };

		assertArrayEquals(reversedArray, actualReversedArray);

	}

}

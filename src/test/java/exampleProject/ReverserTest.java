package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverserTest {

	@Test
	public void test() {
		Integer[] test = new Integer[5];
		Reverser rev = new Reverser();
		for (int i = 1; i < 6; i++) test[i-1] = i; 
		Object[] reversed = rev.reverseIntegerArray(test);
		Integer[] expected = {5, 4, 3, 2, 1};
		assertArrayEquals(expected,reversed);
	}

}

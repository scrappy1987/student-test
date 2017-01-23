package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void reverseTest() {
		Reverser rev = new Reverser();
		
		int[] nameOfArray = {2,4,5,7,8,4};
		
		int[] reversedArray = rev.reverse(nameOfArray);
		
		assertEquals(reversedArray[0], 4);
		
	}
	
}

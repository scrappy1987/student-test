package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testMultiplication(){
		Multiplication multi = new Multiplication();
		int answer = multi.multiply(10,7);
		assertEquals(70, answer);
	}

}

package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void multiplyTest() {
		Multiply multi = new Multiply();
		int newNum = multi.multi(10,5);
		assertEquals(50, newNum);
	}

}
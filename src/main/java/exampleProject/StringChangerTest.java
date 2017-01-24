package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringChangerTest {

	@Test
	public void test() {
		String firstString = "Dog";
		String secondString = "God";
		StringChanger SC = new StringChanger();
		int numberOfChanges = SC.NumOfChanges(firstString, secondString);
		assertEquals(numberOfChanges, 2);
	}

}

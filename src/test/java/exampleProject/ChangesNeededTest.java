package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChangesNeededTest {

	@Test
	public void test() {
		
		ChangesNeeded stringChanger = new ChangesNeeded();
		
		String string1 = "Maven is pretty cool";
		String string2 = "Sandwich lady is life";
		int changes = stringChanger.noOfChanges(string1, string2);
		assertEquals("failed",18,changes);
	}

}

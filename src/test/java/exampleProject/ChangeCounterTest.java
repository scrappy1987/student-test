package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChangeCounterTest {

	@Test
	public void changeCounterTest() {
		
		ChangeCounter changeCount = new ChangeCounter();
		
		String original = "Maven is pretty cool";
		String after = "Sandwich lady is life";
		
		int countedChanges = changeCount.countChangesNeeded(original, after);
		
		assertEquals(countedChanges, 18);
	}

}

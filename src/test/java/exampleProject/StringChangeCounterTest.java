package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringChangeCounterTest {

	@Test
	public void test() {
		StringChangeCounter scc = new StringChangeCounter();
		String original = "Maven is pretty cool";
		String changed = "Sandwich lady is life";
		int changes = scc.countChanges(original, changed);
		System.out.println(changes);
		assertEquals(18,changes);
	}

}

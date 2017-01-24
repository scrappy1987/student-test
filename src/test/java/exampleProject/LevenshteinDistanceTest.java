package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class LevenshteinDistanceTest {

	@Test
	public void test() {
		LevenshteinDistance ld = new LevenshteinDistance();
		assertEquals(2, ld.getLevDistance("Dog", "God"));
		assertEquals(1, ld.getLevDistance("Hello", "Hell"));
		assertEquals(18, ld.getLevDistance("Maven is pretty cool", "Sandwich lady is life"));
	}

}

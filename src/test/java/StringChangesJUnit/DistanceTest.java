package StringChangesJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import StringChanges.Distance;

public class DistanceTest {

	@Test
	public void stringDistanceTest() {
		Distance d = new Distance();
		int dist = d.getDistance();
		assertEquals(dist,18);
	}
}

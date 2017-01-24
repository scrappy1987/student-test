package exampleProject;
import org.apache.commons.lang3.StringUtils;
import static org.junit.Assert.*;

import org.junit.Test;

public class LevenTest {

	@Test
	public void levenTest() {
		assertEquals(18,StringUtils.getLevenshteinDistance("Maven is pretty cool", "Sandwhich Lady is Life") );
	}

}

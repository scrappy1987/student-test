package exampleProject;
import static org.junit.Assert.*;
import exampleProject.Multiplier;

import org.junit.Test;

public class MultiplierTests
{
	@Test
	public void test()
	{
		Multiplier m = new Multiplier();
		int result = m.multiply(2, 6);
		assertEquals(result,12);
	}
}
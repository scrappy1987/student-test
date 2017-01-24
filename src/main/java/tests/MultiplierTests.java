package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import scripts.Multiplier;

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
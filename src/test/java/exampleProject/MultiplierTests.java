package test;
import static org.junit.Assert.*;
import main.Multiplier;

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
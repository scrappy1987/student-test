package exampleProject;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

	@Test
	public void test() {
		Adder adder1 = new Adder(1, 1);
		Adder adder2 = new Adder(2, 2);
		Adder adder3 = new Adder(3, 3);
		Assert.assertEquals(adder1.getTotal(), 2);
		Assert.assertEquals(adder2.getTotal(), 4);
		Assert.assertEquals(adder3.getTotal(), 6);
	}

}

package exampleProject;

import org.junit.Assert;
import org.junit.Test;

public class SubtractorTest {

	@Test
	public void test() {
		Subtractor sub = new Subtractor();
		int answer = sub.subtract(10, 4);
		Assert.assertEquals(answer, 6);
	}

}

package exampleProject;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MvnDETest {

	@Test
	public void test() {
		int levDist;
		String testString1 = "Maven is pretty cool";
		String testString2 = "Sandwich Lady is life";
		MvnDE test = new MvnDE();
		
		levDist = test.doitfam(testString1, testString2);
		System.out.println(levDist);
		
		Assert.assertEquals(levDist, 18);
	}

}

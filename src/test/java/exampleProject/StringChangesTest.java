package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringChangesTest {

	@Test
	public void testStringChanges1() {
		StringChanges sc = new StringChanges();
		String string1 = "Hello";
		String string2 = "Hell";
		int answer = sc.checkStrings(string1,string2);
		assertEquals(answer,1);
	}
	
	@Test
	public void testStringChanges2() {
		StringChanges sc = new StringChanges();
		String string1 = "Dog";
		String string2 = "God";
		int answer = sc.checkStrings(string1,string2);
		assertEquals(answer,2);
	}

}

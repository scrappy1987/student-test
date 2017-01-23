package test;

import static org.junit.Assert.*;
import main.ArraySwitcher;

import org.junit.Test;

public class ArraySwitchTest
{
	@Test
	public void test()
	{
		ArraySwitcher s = new ArraySwitcher();
		int[] testArray = new int[]{1,2,3,4,5};
		testArray = s.switchArray(testArray);
		assertEquals(testArray[0],5);
		assertEquals(testArray[1],4);
		assertEquals(testArray[2],3);
		assertEquals(testArray[3],2);
		assertEquals(testArray[4],1);
	}
}

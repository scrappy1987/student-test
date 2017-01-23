package tests;

import static org.junit.Assert.*;
import java.lang.reflect.Array;
import org.junit.Test;

public class arraytests {

	@Test
	public void test() {
		MedTask med = new MedTask();
		int[] newArray = new int[4];
		newArray[0] = 10;
		newArray[1] = 20;
		newArray[2] = 30;
		newArray[3] = 40;
		
		int[] results = med.arrayReverse(newArray);
		
		assertEquals(results[0], 40);
		assertEquals(results[1], 30);
		assertEquals(results[2], 20);
		assertEquals(results[3], 10);
	}

}

package tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Test;

public class arraytests {

	@Test
	public void test() {
		MedTask med = new MedTask();
		int[] newArray = new int[3];
		newArray[0] = 0;
		newArray[1] = 1;
		newArray[2] = 2;
		newArray[3] = 3;
		
		int[] results = med.arrayReverse(newArray);
		
		assertEquals(results[0], 3);
		assertEquals(results[1], 2);
		assertEquals(results[2], 1);
		assertEquals(results[3], 0);
	}

}
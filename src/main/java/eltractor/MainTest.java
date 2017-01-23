package eltractor;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Main main = new Main();
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] array = main.reverseArray(a);
		
		int[] b = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		assertArrayEquals(b, array);
	}

}

package exampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverserTest {

	
		
		@Test public void ReverseTest0() {
			Reverser R = new Reverser();
			int[] arr1 = {1,2,3,4};
			int [] temp = R.Reverse(arr1);
			assertEquals(4,temp[0]);
		}
		@Test public void ReverseTest1() {
			Reverser R = new Reverser();
			int[] arr1 = {1,2,3,4};
			int [] temp = R.Reverse(arr1);
			assertEquals(3,temp[1]);
		}
		@Test public void ReverseTest2() {
			Reverser R = new Reverser();
			int[] arr1 = {1,2,3,4};
			int [] temp = R.Reverse(arr1);
			assertEquals(2,temp[2]);
		}
		@Test public void ReverseTest3() {
			Reverser R = new Reverser();
			int[] arr1 = {1,2,3,4};
			int [] temp = R.Reverse(arr1);
			assertEquals(1,temp[3]);
		}

		
	}




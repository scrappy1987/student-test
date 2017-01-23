package eltractor;

public class Main {
	// insert an array of ints to the method.
	public int[] reverseArray(int[] arrayToReverse){
		
		/* 
		 * create a temporary list the same size of the array passed, this will be used to handle output of the
		 * computed changes. 
		 */
		int[] tmp = new int[arrayToReverse.length];
		
		// We start our array point at the size of the passed array -1 to accomodate the 0 position in the array.
		// We then check that the i position is GREATER THAN -1; i.e 0
		// Then decrement through the array until we reach 0
		for(int i = arrayToReverse.length - 1; i>(-1); i--){
			// assign the last position as the first position of the passed array.
			tmp[arrayToReverse.length-i-1] = arrayToReverse[i];
		}
		
		// return the computed temporary list
		return tmp;
	}
}

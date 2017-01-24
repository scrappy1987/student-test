package exampleProject;

public class Reverser {
	public Integer[] reverseIntegerArray(Integer[] array) {
		int len = array.length;
		Integer[] output = new Integer[len];
		for (int i = 0, j = len -1; i < len; i++, j--) {
			output[i] = array[j];
		}
		return output;
	}
}

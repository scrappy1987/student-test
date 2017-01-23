package exampleProject;

public class Reverser {

	public int[] reverse(int[] nameOfArray) {
		
		int[] reversedArray = new int [nameOfArray.length];
		
		for (int i = 0; i < reversedArray.length; i++) {
			
			reversedArray[i] = nameOfArray[nameOfArray.length - (i + 1)];
			
		}
		
		return reversedArray;
	}
	
}

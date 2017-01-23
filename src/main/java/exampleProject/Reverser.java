package exampleProject;

public class Reverser {

	public int[] Reverse(int[] arr1) {
		for(int i=0; i< arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		int[] temp = new int[arr1.length];
		
		for (int i=arr1.length -1, j=0; i >-1; i--, j++) {
			temp[j] = arr1[i];
			
		}
		for(int i=0; i< temp.length; i++) {
			System.out.println(temp[i]);
		}
		return temp;
		
	}

}

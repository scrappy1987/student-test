package tests;

public class MedTask {

	public MedTask(){
		
	}
	
	public int[] arrayReverse(int[] newArray) {
		int[] tempArray = new int[4];
		int locToChange = newArray.length -1;
		
		for (int i=0; i<newArray.length; i++){
			tempArray[i] = newArray[locToChange];			
			locToChange--;
		}
		
		return tempArray;
	}
}
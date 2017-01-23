package exampleProject;

public class ArraySwitcher
{
	public int[] switchArray(int[] testArray)
	{
		int l = testArray.length;
		int[] returnArray = new int[l];
		
		for(int i = 0; i < l; i++)
			returnArray[i] = testArray[l-i-1];
	
		return returnArray;
	}
}

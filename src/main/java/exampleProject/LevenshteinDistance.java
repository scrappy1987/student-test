package exampleProject;

import org.apache.commons.lang3.StringUtils;

public class LevenshteinDistance {
	public static void main(String [ ] args)
	{
		getLevenshteinDistance();
	}
	public static int getLevenshteinDistance() {
		//System.out.println("hi");
		int i = StringUtils.getLevenshteinDistance("Maven is pretty cool", "Sandwich lady is life");
		System.out.println(i);
		return i;
	}
	
}

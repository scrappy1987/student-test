package exampleProject;

import org.apache.commons.lang3.StringUtils;
public class ChangesNeeded {

	public int noOfChanges(String string1, String string2) {
		
		
		return StringUtils.getLevenshteinDistance(string1, string2);
		
	}

}

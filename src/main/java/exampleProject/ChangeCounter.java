package exampleProject;

import org.apache.commons.lang3.StringUtils;

public class ChangeCounter {
	
	public int countChangesNeeded(String original, String after) {
		
		return StringUtils.getLevenshteinDistance(original, after);
		
	}

}

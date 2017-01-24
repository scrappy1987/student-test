package exampleProject;

import org.apache.commons.lang3.StringUtils;

public class StringChangeCounter {

	public int countChanges(String original, String changed) {
		return StringUtils.getLevenshteinDistance(original, changed);
	}

}

package exampleProject;
import org.apache.commons.lang3.StringUtils;

public class LevenshteinDistance {

	public int getLevDistance(String string1, String string2) {
		return StringUtils.getLevenshteinDistance(string1, string2);
	}

}

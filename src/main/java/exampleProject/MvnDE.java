package exampleProject;

import org.apache.commons.lang3.StringUtils;

public class MvnDE {

	public int doitfam(String ey, String play) {
		int levDist;
		levDist = StringUtils.getLevenshteinDistance(ey, play);
		return levDist;
	}

}

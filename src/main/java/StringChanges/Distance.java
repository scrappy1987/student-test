package StringChanges;

import org.apache.commons.lang3.StringUtils;

public class Distance {
		
	public static int getDistance() {
		int lDist = StringUtils.getLevenshteinDistance("Maven is pretty cool","Sandwich lady is life");
		return lDist;
	}

}

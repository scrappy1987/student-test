package StringChange;

import org.apache.commons.*;
import org.apache.commons.lang3.StringUtils;

public class StringChange {

	public int changeString(String initial, String end) {
		int tmp = 0;
			tmp = StringUtils.getLevenshteinDistance(initial, end);
		System.out.println(tmp);
		return tmp;
	}

}

package scripts;
import org.apache.commons.lang3.StringUtils;

public class StringDistance {
	public static void main(String[] args) {
		int distance = StringUtils.getLevenshteinDistance("Hello","Hell");
		System.out.println(distance);
	}

}

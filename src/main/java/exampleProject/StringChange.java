package exampleProject;
import org.apache.commons.lang3.StringUtils;


public class StringChange {
public int getDistance(){
	int dist = StringUtils.getLevenshteinDistance("Maven is pretty cool", "Sandwhich lady is life");
	return dist;
	
}
}

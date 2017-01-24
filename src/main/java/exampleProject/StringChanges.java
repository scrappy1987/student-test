package exampleProject;

import org.apache.commons.lang3.StringUtils;

public class StringChanges {

	public StringChanges(){
		
	}
	
	public int checkStrings(String value1, String value2){
		return StringUtils.getLevenshteinDistance(value1, value2);
	}
	
}

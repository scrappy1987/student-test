package exampleProject;

import org.apache.commons.lang3.StringUtils;

public class StringChanger {

	public int NumOfChanges(String firstString, String secondString){	
		int changesRequired = StringUtils.getLevenshteinDistance(firstString, secondString);
			return changesRequired;
	}
	 
	
	
//	int StringUtils.getLevenshteinDistance(String firstString, String secondString){
	//	return 4;
	//};


	
}

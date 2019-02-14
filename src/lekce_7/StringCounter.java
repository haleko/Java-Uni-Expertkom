package lekce_7;

import java.util.HashMap;
import java.util.List;

public class StringCounter {
	
	public HashMap<String, Integer> coutnStringInList(List<String>listOfWords){
		HashMap<String, Integer> results = new HashMap<String, Integer>();
		for (String i:listOfWords) {
			if(results.containsKey(i)) {
				results.put(i, results.get(i)+1);
			}
			else {
				results.put(i,1);
			}
			
		}
	
	return results;
	}

}
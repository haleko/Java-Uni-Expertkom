package lekce_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicitySelector { 

	public List<String> findDuplicities(List<String>allData){
		HashSet<String> uniqes = new HashSet<String>();
		ArrayList <String> listOfDuplicities = new ArrayList<>();
		for (String s : allData ) {
			if (!uniqes.add(s)) {
				if(!listOfDuplicities.contains(s)) {
					
					listOfDuplicities.add(s);
				}
				
			}
		}
		return listOfDuplicities;
	}
	public void printDuplicities(List<String>listOfDuplicities) {
	for (String s : listOfDuplicities) {
		System.out.println(s);
	}
}
}

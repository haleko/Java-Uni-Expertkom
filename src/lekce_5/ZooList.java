package lekce_5;

import java.util.ArrayList;
import java.util.List;

public class ZooList {

	private List<String> zvirata;
	
	
	public List<String> getStringShorterThenFive(){
	
		List<String> wordsShorterThenFive = new ArrayList<String>();
		
		for (String s : this.zvirata) {
			if(s.length()<5) {
				wordsShorterThenFive.add(s);
			}
		}
		return wordsShorterThenFive;
	
}
	
public void pritnResults(List<String> wordsShorterThenFive) {
	for (String s: wordsShorterThenFive) {
		System.out.println(s);
	}
}


}

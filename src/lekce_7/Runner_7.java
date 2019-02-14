package lekce_7;

import java.util.ArrayList;
import java.util.HashMap;

public class Runner_7 {
	public static void main(String[] args) {
		
		ArrayList<String> listOfWords = new ArrayList<>();
		listOfWords.add("one");
		listOfWords.add("two");
		listOfWords.add("one");
		listOfWords.add("neco");
		listOfWords.add("baf");
		
		StringCounter counter = new StringCounter();
		HashMap<String, Integer> results = counter.coutnStringInList(listOfWords);
		
		System.out.println(results);
	}

}

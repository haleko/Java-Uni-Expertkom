package lekce_5;

import java.util.ArrayList;
import java.util.List;

public class RunnerZooList {

	public static void main(String[] args) {
		
		 List<String> animals = new ArrayList<>();
		 animals.add("kocka");
		 animals.add("had");
		 animals.add("pes");
		 animals.add("kralik");
		 
		ZooList zooList = new ZooList();
		 
		 List<String> wordsShorterThenFive = zooList.getStringShorterThenFive();
		 zooList.pritnResults(wordsShorterThenFive);
		 
		 

	}
	
}


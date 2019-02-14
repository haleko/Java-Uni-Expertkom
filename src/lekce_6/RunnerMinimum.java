package lekce_6;

import java.util.ArrayList;
import java.util.List;

public class RunnerMinimum {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(-12);
		numbers.add(5);
		numbers.add(8);
		numbers.add(29);		
		Minimum Minimum1 = new Minimum(numbers);
		int i = Minimum1.findMinimum();
		System.out.println(i);
		
		
		ArrayList<String> data = new ArrayList<>();
		data.add("asdf");
		data.add("asqwefadf");
		data.add("asdf");
		data.add("asdf");
		data.add("asdf");
		DuplicitySelector duplSel = new DuplicitySelector();		
		List<String> listOfDuplicities = duplSel.findDuplicities(data);
		duplSel.printDuplicities(listOfDuplicities);
		
	}

}

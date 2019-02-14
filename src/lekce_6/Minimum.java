package lekce_6;

import java.util.List;

public class Minimum {
	
	private List<Integer> numbers;
	
	public Minimum(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	public int findMinimum() {
		int min = numbers.get(0);
		for(int i: numbers) {
		if(min > i) {
			min=i;
			}
		}
		return min;
	}

}

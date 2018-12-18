package lekce_2;

public class elseIfPriklad {

	public static void main(String[] args) {
		int number= 0;

		if (number > 0) { 
			System.out.println("cislo je kladne");
		}
	
		else if (number <0 ) {
			System.out.println("cislo je zaporne");			
		}
		else {
			System.out.println("cislo je nula");
		}
		}
}

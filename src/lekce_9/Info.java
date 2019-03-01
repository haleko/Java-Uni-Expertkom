package lekce_9;

public class Info {
	int vek;
	String meno;
	
	void printInfoAboutMe(int vek) {
		System.out.println("Je mi " +vek+" let");
	}
	void printInfoAboutMe(String meno) {
		System.out.println("Moje jmeno je "+ meno);
	}
}

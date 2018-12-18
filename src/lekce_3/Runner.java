package lekce_3;

public class Runner {

	public static void main(String[] args) {
		Produkt kofila = new Produkt();
		Produkt mila = new Produkt(13,"Mila",50,"g",12.50f);
		
		/*(int id, String name, int volume, String volumeUnit, float price)*/
		
		System.out.println(kofila.id);
		System.out.println(mila.name);
	}

}

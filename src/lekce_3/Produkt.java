package lekce_3;

public class Produkt {

	int id;
	String name;
	int volume;
	String volumeUnit;
	float price;
	
	Produkt() {
		
		id = 10;
	}
	
	Produkt(int id, String name, int volume, String volumeUnit, float price){
		this.id = id;
		this.name = name;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.price = price;
	}
	
	
	
}

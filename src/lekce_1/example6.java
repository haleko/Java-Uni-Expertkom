package lekce_1;

public class example6 {

	public static void main(String[] args) {
	int count, a=1, b=200;
	
	System.out.print("Všechna lichá èísla od " + a + " do " + b +" jsou: ");
	for(count = a ; count <b; count++) {
	if ( count % 2 != 0 ) {
		System.out.println(count);	
	
	}
	}
	}
}
//Všechna lichá do 200
//zbytek po dìlení není nula
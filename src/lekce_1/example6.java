package lekce_1;

public class example6 {

	public static void main(String[] args) {
	int count, a=1, b=200;
	
	System.out.print("V�echna lich� ��sla od " + a + " do " + b +" jsou: ");
	for(count = a ; count <b; count++) {
	if ( count % 2 != 0 ) {
		System.out.println(count);	
	
	}
	}
	}
}
//V�echna lich� do 200
//zbytek po d�len� nen� nula
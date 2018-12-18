package lekce_2;

import java.io.IOException;

public class elsePriklad {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Press key and then enter: ");
		char keyboardEntry = (char) System.in.read();
		if (keyboardEntry == ('k')) {
			System.out.println("Spravne " +keyboardEntry);
		}else {
			System.out.println("Nespravne");
		}
	}

}

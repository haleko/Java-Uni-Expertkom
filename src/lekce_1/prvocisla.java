package lekce_1;

public class prvocisla {

	public static void main(String[] args) {
		int cisloOd=2, cisloDo=100, i,j, counter;
		System.out.println("Prvoèísla od " + cisloOd+ " do "+ cisloDo+ " jsou: ");
		for(i=cisloOd; i<=cisloDo; i++) {
			counter=0;
			for (j=1;j<=i;j++) {
				if(i%j==0) {
					counter++;
				
				}
				}
			if (counter==2) {
				System.out.println(i);
			}
			
			}
		
		
		}
	}

// Napíšte program, ktorý vyh¾adá všetky prvoèísla od 2 do 100. Prvoèíslo = dìlitelné beze zbytku jen sebou a jednièkou (dva zbytky po dìlení=0).
package lekce_1;

public class prvocisla {

	public static void main(String[] args) {
		int cisloOd=2, cisloDo=100, i,j, counter;
		System.out.println("Prvo��sla od " + cisloOd+ " do "+ cisloDo+ " jsou: ");
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

// Nap�te program, ktor� vyh�ad� v�etky prvo��sla od 2 do 100. Prvo��slo = d�liteln� beze zbytku jen sebou a jedni�kou (dva zbytky po d�len�=0).
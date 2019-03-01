package lekce_9;

public class DeleniTryCatch {
	int delenec[];
	int delitel[];
	
	public DeleniTryCatch(int[] delenec, int[] delitel) {
		super();
		this.delenec = delenec;
		this.delitel = delitel;
	}
	
	public void devide() {
		for (int i=0; i< this.delenec.length; i++) {
			try { System.out.println(this.delenec[i] + " / " + this.delitel[i] + " je " + this.delenec[i]/this.delitel[i]);
						
			}
			catch (ArithmeticException exc) {
				System.out.println("Nelze delit nulou");
			}
			
		}

		
	}
}

package lekce_9;

public class Runner {

	public static void main(String[] args) {
		Info infoAboutMeRun = new Info();
		
		int vek = 27;
		String meno = "Ondrej";
		
		infoAboutMeRun.printInfoAboutMe(vek);
		infoAboutMeRun.printInfoAboutMe(meno);
	}

}

package lekce_8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	List<String> answers = Arrays.asList("kamen", "nuzky", "papir");
	
	public void playGame() {
		while (true) {
			System.out.println("\nZadejte \"kamen \",\"nuzky \",\"papir\" nebo \"konec\": ");
			String answer = getAnswerFromThePlayer();
			String randomElement = getRandomFromComputer();
			
			if (answer.equals(randomElement)) {
				System.out.println("Plichta");
			}	else if (
					userWins(answer, randomElement))
			{			
			System.out.println("You win !!!");
			}	else if (
					userLost(answer, randomElement))
			{			
			System.out.println("You Lose !!!");
			}	
			else if (answer.equals("konec")) {
			System.out.println("Konec hry");
			break;
			}	else System.out.println("Zadal jste neexistující možnost");
		}
	}
	public boolean userWins(String answer, String randomElement) {
		return (answer.equals("kamen")&& randomElement.equals("nuzky"))||
		(answer.equals("nuzky")&& randomElement.equals("papir"))||
		(answer.equals("papir")&& randomElement.equals("kamen"));
	}
	
	public boolean userLost(String answer, String randomElement) {
		return (randomElement.equals("kamen")&& answer.equals("nuzky"))||
		(randomElement.equals("nuzky")&& answer.equals("papir"))||
		(randomElement.equals("papir")&& answer.equals("kamen"));
	}
	
	private String getAnswerFromThePlayer() {
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		return answer;
	}
	
	private String getRandomFromComputer() {
		Random rand = new Random();
		String randomElement = answers.get(rand.nextInt(answers.size()));
		return randomElement;
	}
}

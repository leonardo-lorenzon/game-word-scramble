import java.util.Scanner;

public class Entry {
	public static void main(String[] args) {
		String gameModeInput = "";
		Scanner scanner = new Scanner(System.in);
		
		while (!gameModeInput.equals("T") && !gameModeInput.equals("B")) {
			System.out.println("Choose the game mode. (T) for Three Lives, (B) for Best of Ten.");
			gameModeInput = scanner.nextLine();
		}
		
		GameMechanics gameMechanics = new GameMechanicsFactory()
				.getGameMechanics(GamesModesMapper.toGameMode(gameModeInput));
		
		while (!gameMechanics.isGameOver()) {
			String scrambledWord = gameMechanics.getScrambledWord();
			String wordInput;
			
			System.out.println("Try to guess the following word: "+scrambledWord);
			
			wordInput = scanner.nextLine();
			
			if (gameMechanics.isWordCorrect(wordInput)) {
				System.out.println("Right answer!");
			} else {
				System.out.println("Wrong answer.");
			}
			
		}
		
		System.out.println("Game Over. Your final score was: "+gameMechanics.getPoints());

		scanner.close();
	}
}

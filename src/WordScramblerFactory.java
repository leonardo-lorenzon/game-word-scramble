import java.util.Random;

public class WordScramblerFactory {
	private WordScrambler[] scramblers;
	
	public WordScramblerFactory(WordScrambler[] scramblers) {
		this.scramblers = scramblers;
	}
	
	public WordScrambler getRandomScrambler() {
		int randomInt = new Random().nextInt(scramblers.length);
		
		return scramblers[randomInt];
	}
}

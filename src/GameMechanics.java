
public abstract class GameMechanics {
	protected WordScramblerFactory scramblerFactory;
	protected WordsRepository wordsRepository;
	
	public GameMechanics(WordScramblerFactory scramblerFactory, WordsRepository wordsRepository) {
		this.scramblerFactory = scramblerFactory;
		this.wordsRepository = wordsRepository;
	}
	
	public abstract int getPoints();
	public abstract String getScrambledWord();
	public abstract boolean isWordCorrect(String palavra);
	public abstract boolean isGameOver();
}

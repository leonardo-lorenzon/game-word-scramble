
public class BestOfTen extends GameMechanics {
	private String currentWord = "";
	private int points = 0;
	private int count = 10;

	public BestOfTen(WordScramblerFactory wordscramblerFactory, WordsRepository wordsRepository) {
		super(wordscramblerFactory, wordsRepository);
	}

	@Override
	public int getPoints() {
		return points;
	}

	@Override
	public String getScrambledWord() {
		this.setWord();
		this.decreaseCount();
			
		WordScrambler scrambler = this.scramblerFactory.getRandomScrambler();
		
		return scrambler.scrambleWord(this.currentWord);
	}

	@Override
	public boolean isWordCorrect(String word) {
		if (this.currentWord.equalsIgnoreCase(word)) {
			this.addPoints();
			
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isGameOver() {
		return this.count < 1;
	}
	
	private void setWord() {
		this.currentWord = this.wordsRepository.getWord();
	}
	
	private void addPoints() {
		this.points += 1;
	}
	
	private void decreaseCount() {
		this.count -= 1;
	}

}

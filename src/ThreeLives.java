
public class ThreeLives extends GameMechanics {
	private int points = 0;
	private int lives = 3;
	private String currentWord = "";
	private boolean isCorrect = true;
	
	public ThreeLives(WordScramblerFactory wordsScramblerFacotry, WordsRepository wordsRepository) {
		super(wordsScramblerFacotry, wordsRepository);
	}

	@Override
	public int getPoints() {
		return points;
	}

	@Override
	public String getScrambledWord() {
		if (this.isCorrect) {
			this.setWord();	
		}
		
		
		WordScrambler scrambler = this.scramblerFactory.getRandomScrambler();
		
		return scrambler.scrambleWord(this.currentWord);
	}
	
	@Override
	public boolean isWordCorrect(String palavra) {
		if (this.currentWord.equalsIgnoreCase(palavra)) {
			this.addPoints();
			this.setIsCorrect(true);
			
			return isCorrect;
		}
		
		this.removeOneLive();
		this.setIsCorrect(false);
		
		return isCorrect;
	}

	@Override
	public boolean isGameOver() {
		return this.lives < 1;
	}
	
	private void setWord() {
		this.currentWord = this.wordsRepository.getWord();
	}
	
	private void addPoints() {
		this.points += 1;
	}
	
	private void removeOneLive() {
		this.lives -= 1;
	}
	
	private void setIsCorrect(boolean acertou) {
		this.isCorrect = acertou;
	}

}

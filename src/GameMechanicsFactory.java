
public class GameMechanicsFactory {
	private WordScramblerFactory scramblerFactory = new WordScramblerFactory(
				new WordScrambler[] {new ReverserWord(), new SortWordLetters()}
			);
	private WordsRepository wordsRepository = new WordsRepository();
	
	public GameMechanics getGameMechanics(GameModes mecanicas) {
		switch (mecanicas) {
		case THREE_LIVES:
			return new ThreeLives(this.scramblerFactory, this.wordsRepository);
			
		case BEST_OF_TEN:
			return new BestOfTen(this.scramblerFactory, this.wordsRepository);

		default:
			return new ThreeLives(this.scramblerFactory, this.wordsRepository);
		}
	}
}

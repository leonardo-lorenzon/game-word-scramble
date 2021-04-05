import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBestOfTen {
	private GameMechanics bestOfTen;
	
	@BeforeEach()
	void setupConstructor() {
		WordsRepository wordsRepository = new InMemoryWordsReposository();
		WordScramblerFactory scramblerFactory = new WordScramblerFactory(new WordScrambler[] {new WordScramblerDummy()});
		this.bestOfTen = new BestOfTen(scramblerFactory, wordsRepository);
	}

	@Test
	void testGetNewWordWhenAnswerRight() {
		String word = bestOfTen.getScrambledWord();
		
		bestOfTen.isWordCorrect(word);
		
		assertNotEquals(word, bestOfTen.getScrambledWord());
	}
	
	@Test
	void testGetNewWordWhenAnwserWrong() {
		String word = bestOfTen.getScrambledWord();
		
		bestOfTen.isWordCorrect("wrongWord");
		
		assertNotEquals(word, bestOfTen.getScrambledWord());
	}
	
	@Test
	void testAnswerRight() {
		String word = bestOfTen.getScrambledWord();
		
		assertTrue(bestOfTen.isWordCorrect(word.toLowerCase()));
	}
	
	@Test
	void testGameOverFalse() {
		assertFalse(bestOfTen.isGameOver());
	}
	
	@Test
	void testGameOverTrue() {
		// play 10 times
		for (int i = 0; i < 10; i++) {
			bestOfTen.getScrambledWord();
		}
		
		assertTrue(bestOfTen.isGameOver());
	}
	
	@Test
	void testGetInitialPoints() {
		assertEquals(0, bestOfTen.getPoints());
	}
	
	@Test
	void testGetPointsWithOneAnswerRight() {
		String word = bestOfTen.getScrambledWord();
		bestOfTen.isWordCorrect(word);
		
		assertEquals(1, bestOfTen.getPoints());
	}

}

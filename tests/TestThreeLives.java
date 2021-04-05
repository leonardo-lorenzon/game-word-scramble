import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestThreeLives {
	private GameMechanics threeLives;
	
	@BeforeEach()
	void setupConstructor() {
		WordsRepository wordsRepository = new InMemoryWordsReposository();
		WordScramblerFactory scramblerFactory = new WordScramblerFactory(new WordScrambler[] {new WordScramblerDummy()});
		this.threeLives = new ThreeLives(scramblerFactory, wordsRepository);	
	}

	@Test
	void testGetNewWordWhenAnswerRight() {	
		String word = threeLives.getScrambledWord();
		
		threeLives.isWordCorrect(word);
		
		assertNotEquals(word, threeLives.getScrambledWord());
	}
	
	@Test
	void testGetSameWordWhenAnswerWrong() {
		String word = threeLives.getScrambledWord();
		
		threeLives.isWordCorrect("wrongword");
		
		assertEquals(word, threeLives.getScrambledWord());
	}
	
	@Test
	void testAnswerRight() {
		String word = threeLives.getScrambledWord();
		
		assertTrue(threeLives.isWordCorrect(word.toUpperCase()));
	}
	
	@Test
	void testGameOverFalse() {
		assertFalse(threeLives.isGameOver());
	}
	
	@Test
	void testGameOverTrue() {
		// miss 3 time
		threeLives.isWordCorrect("wrong");
		threeLives.isWordCorrect("wrong");
		threeLives.isWordCorrect("wrong");
		
		assertTrue(threeLives.isGameOver());
	}
	
	@Test
	void testGetInitalPoints() {
		assertEquals(0, threeLives.getPoints());
	}
	
	@Test
	void testGetPointsOneAnwserRight() {
		String word = threeLives.getScrambledWord();
		threeLives.isWordCorrect(word);
		
		assertEquals(1, threeLives.getPoints());
	}

}

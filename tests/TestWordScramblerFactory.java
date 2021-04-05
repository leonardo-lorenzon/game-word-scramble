import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestWordScramblerFactory {

	@Test
	void testGetRandomEmbaralhador() {
		WordScrambler[] schrambler = new WordScrambler[] {
				new ReverserWord(), 
				new SortWordLetters()
			};
		
		WordScramblerFactory factory = new WordScramblerFactory(schrambler);
		
		assertTrue(factory.getRandomScrambler() instanceof WordScrambler);
	}

}

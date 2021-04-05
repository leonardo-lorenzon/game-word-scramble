import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSortWordLetters {

	@Test
	void testScrambleWord() {
		WordScrambler scrambler = new SortWordLetters();
		
		assertEquals("CEKORT", scrambler.scrambleWord("Rocket"));
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReverseWord {

	@Test
	void testScrambleWord() {
		WordScrambler scrambler = new ReverserWord();
		
		assertEquals("TEKCOR", scrambler.scrambleWord("Rocket"));
	}

}

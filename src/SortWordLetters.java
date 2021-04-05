import java.util.Arrays;

public class SortWordLetters implements WordScrambler {
	@Override
	public String scrambleWord(String word) {
		char sortedWord[] = word.toUpperCase().toCharArray();
		
		Arrays.sort(sortedWord);
		
		return new String(sortedWord);
	}

}

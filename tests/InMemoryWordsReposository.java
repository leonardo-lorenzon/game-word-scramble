import java.util.ArrayList;
import java.util.Arrays;

public class InMemoryWordsReposository extends WordsRepository {
	
	private ArrayList<String> words = new ArrayList<String>(Arrays.asList(
			"Banana", "Onion", "apple", "merlin", "blue", "pasta", "meat", "meet", "hamburger", "rocket"
			));

	@Override
	public String getWord() {
		return words.remove(words.size() - 1);
	}
}

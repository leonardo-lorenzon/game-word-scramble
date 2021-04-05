import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsRepository {
	private ArrayList<String> wordsCache = new ArrayList<String>();
	
	public String getWord() {
		if (wordsCache.size() == 0) {
			this.loadWords();
		}
		
		return wordsCache.remove(wordsCache.size() - 1);
	}
	
	private void loadWords() {
		File file = new File("./files/words.txt");
		
		try {
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				this.wordsCache.add(scanner.nextLine());
			}
			
			Collections.shuffle(this.wordsCache);
			
			scanner.close();
		} catch (FileNotFoundException e) {
			this.wordsCache.add("palavraDefault");
		}
		
	}
}

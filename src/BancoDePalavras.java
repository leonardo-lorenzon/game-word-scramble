import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BancoDePalavras {
	private ArrayList<String> cachePalavras = new ArrayList<String>();
	
	public String getPalavra() {
		if (cachePalavras.size() == 0) {
			this.loadPalavras();
		}
		
		return cachePalavras.remove(cachePalavras.size() - 1);
	}
	
	private void loadPalavras() {
		File file = new File("../files/palavras.txt");
		
		try {
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				this.cachePalavras.add(scanner.nextLine());
			}
			
			scanner.close();
		} catch (FileNotFoundException e) {
			this.cachePalavras.add("palavraDefault");
		}
		
	}
}

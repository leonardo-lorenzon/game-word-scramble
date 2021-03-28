import java.util.ArrayList;
import java.util.Arrays;

public class InMemoryBancoDePalavras extends BancoDePalavras {
	
	private ArrayList<String> palavras = new ArrayList<String>(Arrays.asList(
			"testUm", "TESTDOIS", "testTres", "TestQUatro"
			));

	@Override
	public String getPalavra() {
		return palavras.remove(palavras.size() - 1);
	}
}

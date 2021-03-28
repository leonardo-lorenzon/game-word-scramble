import java.util.ArrayList;
import java.util.Arrays;

public class InMemoryBancoDePalavras extends BancoDePalavras {
	
	private ArrayList<String> palavras = new ArrayList<String>(Arrays.asList(
			"testUm", "TESTDOIS", "testTres", "TestQUatro", "testCinco", "testSeis", "TEstSete", "testoito", "testnove", "testdez"
			));

	@Override
	public String getPalavra() {
		return palavras.remove(palavras.size() - 1);
	}
}

import java.util.Arrays;

public class OrdenaPalavra implements Embaralhador {
	private String palavra;
	
	public OrdenaPalavra(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public String embaralhaPalavra() {
		char palavraOrdenada[] = palavra.toUpperCase().toCharArray();
		
		Arrays.sort(palavraOrdenada);
		
		return new String(palavraOrdenada);
	}

}

import java.util.Arrays;

public class OrdenaPalavra implements Embaralhador {
	@Override
	public String embaralhaPalavra(String palavra) {
		char palavraOrdenada[] = palavra.toUpperCase().toCharArray();
		
		Arrays.sort(palavraOrdenada);
		
		return new String(palavraOrdenada);
	}

}

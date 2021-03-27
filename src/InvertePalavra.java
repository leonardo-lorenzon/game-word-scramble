
public class InvertePalavra implements Embaralhador {
	@Override
	public String embaralhaPalavra(String palavra) {
		StringBuilder stringBuider = new StringBuilder(palavra);
		
		return stringBuider.reverse().toString().toUpperCase();
	}

}

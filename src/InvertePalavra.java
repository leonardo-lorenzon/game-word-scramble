
public class InvertePalavra implements Embaralhador {
	private String palavra;
	
	public InvertePalavra(String palavra) {
		this.palavra = palavra;
	}

	@Override
	public String embaralhaPalavra() {
		StringBuilder stringBuider = new StringBuilder(palavra);
		
		return stringBuider.reverse().toString().toUpperCase();
	}

}

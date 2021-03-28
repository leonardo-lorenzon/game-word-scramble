
public class MelhorDeDez extends MecanicaDoJogo {
	private String palavraAtual = "";
	private int pontos = 0;
	private int contador = 10;

	public MelhorDeDez(FabricaEmbaralhadores fabricaEmbaralhador, BancoDePalavras bancoDePalavras) {
		super(fabricaEmbaralhador, bancoDePalavras);
	}

	@Override
	public int getPontuacao() {
		return pontos;
	}

	@Override
	public String getPalavraEmbaralhada() {
		this.setPalavra();
		this.decrementaContador();
			
		Embaralhador embaralhador = this.fabricaEmbaralhador.getRandomEmbaralhador();
		
		return embaralhador.embaralhaPalavra(this.palavraAtual);
	}

	@Override
	public boolean acertouPalavra(String palavra) {
		if (this.palavraAtual.equalsIgnoreCase(palavra)) {
			this.addPontos();
			
			return true;
		}
		
		return false;
	}

	@Override
	public boolean terminouJogo() {
		return this.contador < 1;
	}
	
	private void setPalavra() {
		this.palavraAtual = this.bancoDePalavras.getPalavra();
	}
	
	private void addPontos() {
		this.pontos += 1;
	}
	
	private void decrementaContador() {
		this.contador -= 1;
	}

}

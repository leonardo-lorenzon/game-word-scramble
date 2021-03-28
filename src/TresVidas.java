
public class TresVidas extends MecanicaDoJogo {
	private int pontos = 0;
	private int vidas = 3;
	private String palavraAtual = "";
	private boolean acertou = true;
	
	public TresVidas(FabricaEmbaralhadores fabrica, BancoDePalavras banco) {
		super(fabrica, banco);
	}

	@Override
	public int getPontuacao() {
		return pontos;
	}

	@Override
	public String getPalavraEmbaralhada() {
		if (this.acertou) {
			this.setPalavra();	
		}
		
		
		Embaralhador embaralhador = this.fabricaEmbaralhador.getRandomEmbaralhador();
		
		return embaralhador.embaralhaPalavra(this.palavraAtual);
	}
	
	@Override
	public boolean acertouPalavra(String palavra) {
		if (this.palavraAtual.equals(palavra)) {
			this.addPontos();
			this.setAcertou(true);
			
			return acertou;
		}
		
		this.tiraUmaVida();
		this.setAcertou(false);
		
		return acertou;
	}

	@Override
	public boolean terminouJogo() {
		return this.vidas < 1;
	}
	
	private void setPalavra() {
		this.palavraAtual = this.bancoDePalavras.getPalavra();
	}
	
	private void addPontos() {
		this.pontos += 1;
	}
	
	private void tiraUmaVida() {
		this.vidas -= 1;
	}
	
	private void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

}

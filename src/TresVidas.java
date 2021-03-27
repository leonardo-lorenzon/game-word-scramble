
public class TresVidas implements MecanicaDoJogo {
	private int pontos = 0;
	private int vidas = 3;
	private String palavraAtual;
	private FabricaEmbaralhadores fabricaEmbaralhador;
	private BancoDePalavras bancoDePalavras;
	
	private static String regras = "No modo três vidas o jogador pode errar até duas vezes. A cada acerto o jogador ganha um ponto e no erro nenhum.";
	
	public TresVidas() {
		this.fabricaEmbaralhador = new FabricaEmbaralhadores();
		this.bancoDePalavras = new BancoDePalavras();
	}

	@Override
	public int getPontuacaoFinal() {
		return pontos;
	}

	@Override
	public String getPalavraEmbaralhada() {
		this.setPalavra();
		
		Embaralhador embaralhador = this.fabricaEmbaralhador.getRandomEmbaralhador();
		
		return embaralhador.embaralhaPalavra(this.palavraAtual);
	}
	
	@Override
	public boolean acertouPalavra(String palavra) {
		if (this.palavraAtual.equals(palavra)) {
			this.addPontos();
			
			return true;
		}
		
		this.tiraUmaVida();
		
		return false;
	}

	@Override
	public String getRegras() {
		return regras;
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

}

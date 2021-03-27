
public abstract class MecanicaDoJogo {
	protected FabricaEmbaralhadores fabricaEmbaralhador;
	protected BancoDePalavras bancoDePalavras;
	
	public MecanicaDoJogo(FabricaEmbaralhadores fabricaEmbaralhador, BancoDePalavras bancoDePalavras) {
		this.fabricaEmbaralhador = fabricaEmbaralhador;
		this.bancoDePalavras = bancoDePalavras;
	}
	
	public abstract int getPontuacaoFinal();
	public abstract String getPalavraEmbaralhada();
	public abstract boolean acertouPalavra(String palavra);
	public abstract String getRegras();
	public abstract boolean terminouJogo();
}

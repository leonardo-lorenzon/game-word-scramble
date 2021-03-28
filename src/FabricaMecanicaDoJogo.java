
public class FabricaMecanicaDoJogo {
	private FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores(
				new Embaralhador[] {new InvertePalavra(), new OrdenaPalavra()}
			);
	private BancoDePalavras bancoDePalavras = new BancoDePalavras();
	
	public MecanicaDoJogo getMecanicaDoJogo(MecanicasDeJogo mecanicas) {
		switch (mecanicas) {
		case tresVidas:
			return new TresVidas(this.fabricaEmbaralhadores, this.bancoDePalavras);
			
		case melhorDeDez:
			return new MelhorDeDez(this.fabricaEmbaralhadores, this.bancoDePalavras);

		default:
			return new TresVidas(this.fabricaEmbaralhadores, this.bancoDePalavras);
		}
	}
}

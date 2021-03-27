import java.util.Random;

public class FabricaEmbaralhadores {
	private static Embaralhador[] embaralhador = new Embaralhador[] {
			new InvertePalavra(), 
			new OrdenaPalavra()
		};
	
	public Embaralhador getRandomEmbaralhador() {
		int randomInt = new Random().nextInt(embaralhador.length);
		
		return embaralhador[randomInt];
	}
}

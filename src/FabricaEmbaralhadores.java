import java.util.Random;

public class FabricaEmbaralhadores {
	private Embaralhador[] embaralhadores;
	
	public FabricaEmbaralhadores(Embaralhador[] embaralhadores) {
		this.embaralhadores = embaralhadores;
	}
	
	public Embaralhador getRandomEmbaralhador() {
		int randomInt = new Random().nextInt(embaralhadores.length);
		
		return embaralhadores[randomInt];
	}
}

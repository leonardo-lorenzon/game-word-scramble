import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFabricaEmbaralhadores {

	@Test
	void testGetRandomEmbaralhador() {
		Embaralhador[] embaralhador = new Embaralhador[] {
				new InvertePalavra(), 
				new OrdenaPalavra()
			};
		
		FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores(embaralhador);
		
		assertTrue(fabrica.getRandomEmbaralhador() instanceof Embaralhador);
	}

}

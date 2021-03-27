import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFabricaEmbaralhadores {

	@Test
	void testGetRandomEmbaralhador() {
		FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
		
		assertTrue(fabrica.getRandomEmbaralhador() instanceof Embaralhador);
	}

}

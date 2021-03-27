import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFabricaEmbaralhadores {

	@Test
	void testBuild() {
		FabricaEmbaralhadores fabrica = new FabricaEmbaralhadores();
		
		assertTrue(fabrica.build() instanceof Embaralhador);
	}

}

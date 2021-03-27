import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOrdenaPalavra {

	@Test
	void testEmbaralhaPalavra() {
		Embaralhador embaralhador = new OrdenaPalavra();
		
		assertEquals("AAMRS", embaralhador.embaralhaPalavra("Armas"));
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOrdenaPalavra {

	@Test
	void testOrdernaPalavra() {
		Embaralhador embaralhador = new OrdenaPalavra("Armas");
		
		assertEquals("AAMRS", embaralhador.embaralhaPalavra());
	}

}

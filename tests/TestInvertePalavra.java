import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvertePalavra {

	@Test
	void testEmbaralhaPalavra() {
		Embaralhador embaralhador = new InvertePalavra();
		String palavra = "Armas";
		
		assertEquals("SAMRA", embaralhador.embaralhaPalavra(palavra));
	}

}

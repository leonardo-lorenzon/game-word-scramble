import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMelhorDeDez {
	private MecanicaDoJogo melhorDeDez;
	
	@BeforeEach()
	void setupConstructor() {
		BancoDePalavras bancoDepalavras = new InMemoryBancoDePalavras();
		FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores(new Embaralhador[] {new EmbaralhadorDummy()});
		this.melhorDeDez = new MelhorDeDez(fabricaEmbaralhadores, bancoDepalavras);
	}

	@Test
	void testGetNovaPalavraSeAcertou() {
		String palavra = melhorDeDez.getPalavraEmbaralhada();
		
		melhorDeDez.acertouPalavra(palavra);
		
		assertNotEquals(palavra, melhorDeDez.getPalavraEmbaralhada());
	}
	
	@Test
	void testGetNovaPalavraSeErrou() {
		String palavra = melhorDeDez.getPalavraEmbaralhada();
		
		melhorDeDez.acertouPalavra("palavraerrada");
		
		assertNotEquals(palavra, melhorDeDez.getPalavraEmbaralhada());
	}
	
	@Test
	void testAcertouPalavra() {
		String palavra = melhorDeDez.getPalavraEmbaralhada();
		
		assertTrue(melhorDeDez.acertouPalavra(palavra.toLowerCase()));
	}
	
	@Test
	void testTerminouJogoFalse() {
		assertFalse(melhorDeDez.terminouJogo());
	}
	
	@Test
	void testTerminouJogoTrue() {
		// jogar 10 vezes
		for (int i = 0; i < 10; i++) {
			melhorDeDez.getPalavraEmbaralhada();
		}
		
		assertTrue(melhorDeDez.terminouJogo());
	}
	
	@Test
	void testGetPontuacaoInicial() {
		assertEquals(0, melhorDeDez.getPontuacao());
	}
	
	@Test
	void testGetPontuacaoUmAcerto() {
		String palavra = melhorDeDez.getPalavraEmbaralhada();
		melhorDeDez.acertouPalavra(palavra);
		
		assertEquals(1, melhorDeDez.getPontuacao());
	}

}

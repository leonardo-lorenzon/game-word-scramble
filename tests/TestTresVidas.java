import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTresVidas {
	private BancoDePalavras bancoDepalavras;
	private FabricaEmbaralhadores fabricaEmbaralhadores;
	
	@BeforeEach()
	void setupConstructor() {
		this.bancoDepalavras = new InMemoryBancoDePalavras();
		this.fabricaEmbaralhadores = new FabricaEmbaralhadores(new Embaralhador[] {new EmbaralhadorDummy()});
		
	}

	@Test
	void testGetNovaPalavraSeAcertou() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		String palavra = tresVidas.getPalavraEmbaralhada();
		
		tresVidas.acertouPalavra(palavra);
		
		assertNotEquals(palavra, tresVidas.getPalavraEmbaralhada());
	}
	
	@Test
	void testGetMesmaPalavraSeErrou() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		String palavra = tresVidas.getPalavraEmbaralhada();
		
		tresVidas.acertouPalavra("palavraerrada");
		
		assertEquals(palavra, tresVidas.getPalavraEmbaralhada());
	}
	
	@Test
	void testAcertouPalavra() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		String palavra = tresVidas.getPalavraEmbaralhada();
		
		assertTrue(tresVidas.acertouPalavra(palavra));
	}
	
	@Test
	void testTerminouJogoFalse() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		assertFalse(tresVidas.terminouJogo());
	}
	
	@Test
	void testTerminouJogoTrue() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		// errar 3 vezes
		tresVidas.acertouPalavra("errada");
		tresVidas.acertouPalavra("errada");
		tresVidas.acertouPalavra("errada");
		
		assertTrue(tresVidas.terminouJogo());
	}
	
	@Test
	void testGetPontuacaoInicial() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		assertEquals(0, tresVidas.getPontuacao());
	}
	
	@Test
	void testGetPontuacaoUmAcerto() {
		MecanicaDoJogo tresVidas = new TresVidas(this.fabricaEmbaralhadores, this.bancoDepalavras);
		
		String palavra = tresVidas.getPalavraEmbaralhada();
		tresVidas.acertouPalavra(palavra);
		
		assertEquals(1, tresVidas.getPontuacao());
	}

}

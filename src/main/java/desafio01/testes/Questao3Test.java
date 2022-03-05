package desafio01.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio01.classes.Questao3;

class Questao3Test {

	@Test
	void testEncontrarAnagramas() {
		Questao3 ex3 = new Questao3();
		String palavra = "ifailuhkqq";
		
		int retornoFeito = ex3.buscaAnagramas(palavra);
		int retornoEsperado = 3;
		
		assertEquals(retornoEsperado, retornoFeito);
	}

}

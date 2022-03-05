package desafio01.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio01.classes.Questao1;


class Questao1Test {

	@Test
	void testCriarEscada() {
		Questao1 ex1 = new Questao1();
		int numero = 6;

		boolean retornoFeito = ex1.mostraEscada(numero);
		boolean retornoEsperado = true;

		assertEquals(retornoEsperado, retornoFeito);
	}

}

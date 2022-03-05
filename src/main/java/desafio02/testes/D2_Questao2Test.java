package desafio02.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio02.classes.D2_Questao2;

class D2_Questao2Test {

	@Test
	void test() {
		D2_Questao2 q2 = new D2_Questao2();
		
		int n [] = {1, 5, 3, 4, 2};

		int retornoFeito = q2.calculaDiferença(n, 2);
		int retornoEsperado = 3;
		
		assertEquals(retornoEsperado, retornoFeito);
	}

}

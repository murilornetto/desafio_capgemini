package desafio01.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio01.classes.Questao2;


class Questao2Test {
	@Test
	void test() {
		Questao2 ex2 = new Questao2();
		String senha = "Ya3";

		boolean retornoEsperado = false;
		boolean retornoFeito = ex2.validaSenha(senha);
		
		assertEquals(retornoEsperado, retornoFeito);
	}

}

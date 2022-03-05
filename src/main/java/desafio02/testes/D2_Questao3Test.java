package desafio02.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio02.classes.D2_Questao3;

class D2_Questao3Test {

	@Test
	void test() {
		D2_Questao3 q3 = new D2_Questao3();
		String s = "tenha um bom dia";
		
		String retornoFeito = q3.Encriptar(s);
		String retornoEsperado = "taoaeumnmdhbi";

		assertEquals(retornoEsperado, retornoFeito);
	}

}

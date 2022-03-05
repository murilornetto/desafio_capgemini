package desafio02.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import desafio02.classes.D2_Questao1;

class D2_Questao1Test {

	@Test
	void test() {
		D2_Questao1 q1 = new D2_Questao1();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(9); 
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(6);

		int retornoFeito = q1.encontra_Mediana(arr);
		int retornoEsperado = 4;
		
		assertEquals(retornoEsperado, retornoFeito);
	}

}

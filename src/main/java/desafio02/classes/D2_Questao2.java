package desafio02.classes;

import java.util.Arrays;

public class D2_Questao2 {
	
	private int qtdDiferen�a;
	
	public D2_Questao2() {
		qtdDiferen�a = 0;
	}
	
	public int calculaDiferen�a(int n[],int x){				
		Arrays.sort(n);		
		for(int num : n) {
			for(int i = (n.length-1);i != 0;i--) {
				if((n[i] - n[num-1])== x) {
					qtdDiferen�a++;
				}	
			}
		}
		
		System.out.println("Existem "+ qtdDiferen�a + " pares de inteiros no vetor com uma diferen�a de " + x);
		return qtdDiferen�a;
	}
	
}

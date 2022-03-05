package desafio02.classes;

import java.util.Arrays;

public class D2_Questao2 {
	
	private int qtdDiferença;
	
	public D2_Questao2() {
		qtdDiferença = 0;
	}
	
	public int calculaDiferença(int n[],int x){				
		Arrays.sort(n);		
		for(int num : n) {
			for(int i = (n.length-1);i != 0;i--) {
				if((n[i] - n[num-1])== x) {
					qtdDiferença++;
				}	
			}
		}
		
		System.out.println("Existem "+ qtdDiferença + " pares de inteiros no vetor com uma diferença de " + x);
		return qtdDiferença;
	}
	
}

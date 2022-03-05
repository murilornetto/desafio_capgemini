package desafio02.classes;

import java.util.ArrayList;

public class D2_Questao1 {

	public int encontra_Mediana(ArrayList<Integer> numeros){
		
			if(numeros.size()%2 == 0) {
				System.out.println("Digite uma quantidade ímpar de números");
				return 0;
			}
			
			numeros.sort(null);
			
			int mediana = (int)numeros.size()/2;
			
			
			System.out.println("A mediana é: " + numeros.get(mediana));
			
			return numeros.get(mediana);	
	}

	
	
		
		 
	
}

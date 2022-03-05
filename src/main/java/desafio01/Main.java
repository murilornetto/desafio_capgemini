package desafio01;

import java.util.Scanner;

import desafio01.classes.Questao1;
import desafio01.classes.Questao2;
import desafio01.classes.Questao3;



public class Main {

	public static void main(String[] args) {
		
		int opcaoMenu;
		
		do {
			
			System.out.print("##--Desafio 1--##\n\n");
			System.out.print("|----------------------|\n");
			System.out.print("| Opção 1 - Questao 1  |\n");
			System.out.print("| Opção 2 - Questao 2  |\n");
			System.out.print("| Opção 3 - Questao 3  |\n");
			System.out.print("| Opção 4 - Sair       |\n");
			System.out.print("|----------------------|\n");
			System.out.print("Digite a opção desejada: ");
			Scanner menu = new Scanner (System.in);
			opcaoMenu = menu.nextInt();
			
			switch (opcaoMenu) {
			case 1:
				int numero;
				System.out.println("Quantos Degraus deseja:");
				try {
					numero = new Scanner(System.in).nextInt();
					Questao1 qst1 = new Questao1();
					qst1.mostraEscada(numero);
					
				} catch (Exception e) {
					System.out.println("Digite apenas números inteiros!");
				}
				break;
			
			case 2:
				String senha;
				Questao2 qst2 = new Questao2();
				boolean senhaForte;
				do {
					System.out.println("Digite a senha:"); 
					senha = new Scanner(System.in).next();
					senhaForte = qst2.validaSenha(senha);
				}while(!senhaForte);
				
				break;
	
			case 3:
				String palavra; 
				Questao3 qst3 = new Questao3();
				System.out.println("Digite a palavra desejada:"); 
				palavra = new Scanner(System.in).next();
				qst3.buscaAnagramas(palavra);
				break;
				
			case 4:
				System.out.print("\nAté logo!");
				menu.close();	
				break;
			default:
				System.out.print("\nOpção Inválida!");
				break;
			}
		
		}while(opcaoMenu != 4);

	}

}

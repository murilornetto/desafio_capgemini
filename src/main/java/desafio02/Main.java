package desafio02;

import java.util.ArrayList;
import java.util.Scanner;
import desafio02.classes.D2_Questao1;
import desafio02.classes.D2_Questao2;
import desafio02.classes.D2_Questao3;



public class Main {

	public static void main(String[] args) {
		
		int opcaoMenu;
		int tamanhoLista = 0;
		boolean erro;
		do {
			
			System.out.print("##--Desafio 2--##\n\n");
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
				ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
				int i = 0;
				erro = false;
				try {
					System.out.println("Digite quantos numeros terá sua lista:");
					tamanhoLista = new Scanner(System.in).nextInt();
					if(tamanhoLista%2 == 0) { 
						System.out.println("Digite uma quantidade ímpar de números");
						break;
					}	
					
				} catch (Exception e) {
					System.out.println("Digite apenas números inteiros!");
					erro = true;
					break;
				}

				do{
					try {
						System.out.println("Digite o numero desejado:");
						listaNumeros.add(new Scanner(System.in).nextInt());
						
					} catch (Exception e) {
							System.out.println("Digite apenas números inteiros!");
							erro = true;
							break;
						}
						i++;
					}while(i < tamanhoLista);
					
					if(!erro) {
						D2_Questao1 qst1 = new D2_Questao1();
						qst1.encontra_Mediana(listaNumeros);
					}
				break;
			
			case 2:
				int diferenca = 0;
				int j = 0;
				int[] numeros = null;
				erro = false;
				try {
					System.out.println("Digite quantos numeros terá sua lista:");
					tamanhoLista = new Scanner(System.in).nextInt();
					numeros = new int[tamanhoLista];
					System.out.println("Digite a diferença desejada:");
					diferenca = new Scanner(System.in).nextInt();
				}catch (Exception e) {
					System.out.println("Digite apenas números inteiros!");
					erro = true;
					break;
				}
				
				do {
					try {
						System.out.println("Digite o numero desejado:"); 
						numeros[j] = new Scanner(System.in).nextInt();
					}catch (Exception e) {
						System.out.println("Digite apenas números inteiros!");
						erro = true;
						break;
					}
					j++;
				}while(j<tamanhoLista);
				
				if(!erro) {
					D2_Questao2 qst2 = new D2_Questao2();
					qst2.calculaDiferença(numeros, diferenca);
				}
				
				break;
	
			case 3:
				String frase; 
				D2_Questao3 qst3 = new D2_Questao3();
				System.out.println("Digite a frase desejada:"); 
				frase = new Scanner(System.in).nextLine();
				qst3.Encriptar(frase);
				System.out.println(" ");
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

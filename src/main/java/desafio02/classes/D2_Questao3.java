package desafio02.classes;

public class D2_Questao3 {
	
	private char matrizPalavras[][];
	private String palavraCriptografada; 
	private int grid;
	
	public D2_Questao3() {
		palavraCriptografada = new String();
	}
	
	public String Encriptar(String s) {
		
		String caracteresPalavra = s.replaceAll("\\s+","");
		int tamanhoPalavra = caracteresPalavra.length();
		grid = (int)Math.round(Math.sqrt(tamanhoPalavra));
		matrizPalavras = new char[grid][grid];
		
		if((grid * grid) < tamanhoPalavra){
			System.out.println("Digite outro texto!");
		}

		int cont = 0;
		
		for(int linha=0;linha < grid;linha++){
				for(int coluna=0;coluna < grid;coluna++){
					matrizPalavras[linha][coluna] = caracteresPalavra.charAt(cont); 
					cont++;
					if(cont == tamanhoPalavra) {
						break;
					}
				}
		}
		
		for (int l = 0; l < grid; l++){  
				for (int c = 0; c < grid; c++){ 				  
				     System.out.print(matrizPalavras[c][l]);
				     palavraCriptografada =  palavraCriptografada + Character.toString(matrizPalavras[c][l]).trim();
				} 

				System.out.print(" ");
			}
		
		return palavraCriptografada;
	}
}

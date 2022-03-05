package desafio01.classes;

public class Questao3 {
	
	private int qtdAnagramas;
	private int anagrama;
	private Padrao padrao;
	
	public Questao3() {
		qtdAnagramas = 0;
		anagrama = 0;
		padrao = new Padrao();
	}
	
	public int buscaAnagramas(String palavra) {
	
			String caracteresPalavra = palavra.trim();
	
			if(!padrao.isNumber(palavra) && !padrao.isSpecial(palavra)) {

					if (caracteresPalavra.length() <= 1) {
						System.out.println(caracteresPalavra);
				
					} else {
						char [] letra = caracteresPalavra.toCharArray();
						for (int i = 0; i < (caracteresPalavra.length()-1); i++) {
							for(int j = (caracteresPalavra.length()-1); j > i; j--) {
							
								if(letra[i] == caracteresPalavra.charAt(j)) {
									qtdAnagramas++;
								}
							}
		
							anagrama = anagrama ^ caracteresPalavra.charAt(i) ^ caracteresPalavra.charAt(i+1);
													
							if(anagrama == 0) {
								qtdAnagramas++ ;
							}
						}
					 }
					System.out.println("Número de substrings que formam anagramas são: " + qtdAnagramas);
					return qtdAnagramas;
			}else {
				System.out.println("Digite letras apenas!");
				return qtdAnagramas;
			}
		}

}

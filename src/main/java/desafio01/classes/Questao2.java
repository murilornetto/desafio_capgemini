package desafio01.classes;

public class Questao2 {

	private Padrao padrao; 
	
	
	public Questao2() {
		padrao = new Padrao();
	}
	
	
	public boolean validaSenha(String senha){
       
	      	String caracteresSenha = senha.trim();
	        
	      	if(caracteresSenha.length() != 0) {
	     

	        	if(!padrao.isNumber(caracteresSenha)) {
	        		System.out.println("Coloque um número!");
	        		return false;
	        	}
	        
	        	if(!padrao.isLowerCase(caracteresSenha)) {
	        		System.out.println("Coloque uma letra Minúscula!");
	        		return false;
	        	}
	        
	        	if(!padrao.isUpperCase(caracteresSenha)) {
	        		System.out.println("Coloque uma letra Maiúscula!");
	        		return false;
	        	}
	        
	        	if(!padrao.isSpecial(caracteresSenha)) {
	        		System.out.println("Coloque um caractere especial! Exemplo: !@#$%^&*()-+");
	        		return false;
	        	}
	        
	        	int tamanhoMinimo = (6-caracteresSenha.length());
	        
	        	
	        	if(caracteresSenha.length() >= 6) {
	        	
	        		System.out.println("Sua senha é Forte!");
	        		return true;
	        	
	        	}else {
	        		System.out.println("Faltam: " + tamanhoMinimo + " caracteres para sua senha ser forte!");
	        		return false;
	        	 }	  
	      	
	      	}else {
	      		System.out.println("Digite um caractere!");
	      		return false;
	      	}
	  	}
}

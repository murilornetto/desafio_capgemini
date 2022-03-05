package desafio01.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Padrao {
	
	private Pattern patternNumber;
 	private Pattern patternLowerCase;
 	private Pattern patternUpperCase;
 	private Pattern patternSpecial;
	
	
 	public Padrao() {
 		patternNumber = Pattern.compile("[0-9]");
 		patternLowerCase = Pattern.compile("[a-z]");
 		patternUpperCase = Pattern.compile("[A-Z]");
 		patternSpecial = Pattern.compile("[!@#$%^&*()-+]");
 	}
 	
 	public boolean isNumber(String palavra){
	 	Matcher matcherNumber = patternNumber.matcher(palavra);
	 	
	 	if(matcherNumber.find()) {
	 		return true;
	 	}
	 	
	 	return false;
	 
	}
	
	public boolean isLowerCase(String palavra) {
		Matcher matcherLowerCase = patternLowerCase.matcher(palavra);
	 	
		if(matcherLowerCase.find()) {
	 		return true;
	 	}
	 	
	 	return false;
	}

	public boolean isUpperCase(String palavra){
		Matcher matcherUpperCase = patternUpperCase.matcher(palavra);
	 	
		if(matcherUpperCase.find()) {
	 		return true;
	 	}
	 	
	 	return false;
	}
	
	public boolean isSpecial(String palavra) {
		Matcher matcherSpecial = patternSpecial.matcher(palavra);
		
	 	if(matcherSpecial.find()) {
	 		return true;
	 	}
	 	
	 	return false;
	}







}

package github.com.kanashiro.igor.desafio.capgemini.second;

import java.util.regex.Pattern;

public class VerifyPassword {

	public boolean checkPassword(String password) {

		char element;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasNumbers = false;
		boolean hasSpecialSymbols = false;

		if (password.length() < 6) {
			System.out.println("Senha precisa ter no minimo 6 caracteres! Adicione mais " + (6 - password.length()) + 
					" caracteres para a senha ter tamanho valido." );
			return false;
		}
		
		for (int i = 0; i < password.length(); i++) {

			element = password.charAt(i);
			
			if (Character.isLowerCase(element)) {
				hasLowerCase = true;
			} else if (Character.isUpperCase(element)) {
				hasUpperCase = true;
			} else if (Character.isDigit(element)) {
				hasNumbers = true;
			}else if (Pattern.matches(".*[!@#$%^&*()+-]*.", password)) {
				hasSpecialSymbols = true;
			}
		}

		if (!hasLowerCase) {
			System.out.println("Precisa no minimo uma letra minuscula!");
		}
		if (!hasUpperCase) {
			System.out.println("Precisa no minimo uma letra maiuscula!");
		}
		if (!hasNumbers) {
			System.out.println("Precisa no minimo um numero!");
		}
		if (!hasSpecialSymbols) {
			System.out.println("Precisa simbolos especiais!");
		}

		return (hasLowerCase && hasUpperCase && hasNumbers && hasSpecialSymbols);
	}
}

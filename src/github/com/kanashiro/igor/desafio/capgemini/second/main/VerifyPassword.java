package github.com.kanashiro.igor.desafio.capgemini.second.main;

import java.util.regex.Pattern;

public class VerifyPassword {

	/**
	 * This method check the password input
	 * 
	 * @param password
	 * @return
	 */
	public boolean checkPassword(String password) {

		char element;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasNumbers = false;
		boolean hasSpecialSymbols = false;

		if (password.length() < 6) {
			System.out.println("Minimum number of characters must be 6! Please add " + (6 - password.length()) + 
					" more." );
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
			System.out.println("Need at least one lowercase character!");
		}
		if (!hasUpperCase) {
			System.out.println("Need at least one uppercase character!");
		}
		if (!hasNumbers) {
			System.out.println("Need at least one numeric character!");
		}
		if (!hasSpecialSymbols) {
			System.out.println("Need at least one special character!");
		}

		return (hasLowerCase && hasUpperCase && hasNumbers && hasSpecialSymbols);
	}
}

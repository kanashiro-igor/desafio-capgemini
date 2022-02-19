package github.com.kanashiro.igor.desafio.capgemini.second.main;

import java.util.Scanner;

/**
 * This class represents the second challenge:
 * Validating a strong password
 * 
 * @author IgorK
 *
 */
public class SecondExercise {

	public static void main(String[] args) {
		
		String password;
		boolean isValid;
		
		VerifyPassword check = new VerifyPassword();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type your password:");
		password = scan.nextLine();
		scan.close();
		
		
		isValid = check.checkPassword(password);
		if (isValid) {
			System.out.println("Your password = strong!");
		} else {
			System.out.println("Invalid password!");
		}
	}

}

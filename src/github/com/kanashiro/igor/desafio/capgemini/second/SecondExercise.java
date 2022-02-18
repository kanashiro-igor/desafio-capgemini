package github.com.kanashiro.igor.desafio.capgemini.second;

import java.util.Scanner;

/**
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
		
		System.out.println("Informe uma senha:");
		password = scan.nextLine();
		scan.close();
		
		
		isValid = check.checkPassword(password);
		if (isValid) {
			System.out.println("Senha informada = forte!");
		} else {
			System.out.println("Senha informada falta requisitos!");
		}
	}

}

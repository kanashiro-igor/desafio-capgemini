package github.com.kanashiro.igor.desafio.capgemini.first.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author IgorK
 *
 */
public class FirstExercise {

	public static void main(String[] args) {
		
		int stairSize = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho da escada (altura e base): ");
		try {
			stairSize = scan.nextInt();
		} catch(InputMismatchException ex) {
			ex.getMessage();
		}
		scan.close();
		
		Stair stair = new Stair();
		
		stair.makeStair(stairSize);
	}

}

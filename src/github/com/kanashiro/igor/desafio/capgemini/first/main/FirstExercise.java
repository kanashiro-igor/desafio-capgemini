package github.com.kanashiro.igor.desafio.capgemini.first.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class represents the first challenge:
 * Building a stair
 * 
 * @author IgorK
 *
 */
public class FirstExercise {

	public static void main(String[] args) {
		
		int stairSize = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type the stair's size: ");
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

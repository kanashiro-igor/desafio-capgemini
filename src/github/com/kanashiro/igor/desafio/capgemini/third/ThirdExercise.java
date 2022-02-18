package github.com.kanashiro.igor.desafio.capgemini.third;

import java.util.Scanner;


/**
 * 
 * @author IgorK
 *
 */
public class ThirdExercise {

	public static void main(String[] args) {
		
		String string = "";
		int quantAnagrams = 0;
		Scanner scan = new Scanner(System.in);
		TestString anagram = new TestString();
		
		System.out.println("Digite uma palavra:");
		string = scan.nextLine();
		scan.close();
		
		quantAnagrams = anagram.maketest(string);
		
		System.out.println("Quantidade de anagramas encontrados: " + quantAnagrams);
	}

}

package github.com.kanashiro.igor.desafio.capgemini.third.main;

import java.util.Scanner;


/**
 * This class represents the third challenge:
 * Find how many substring pairs are anagrams
 * 
 * @author IgorK
 *
 */
public class ThirdExercise {

	public static void main(String[] args) {
		
		String string = "";
		int quantAnagrams = 0;
		Scanner scan = new Scanner(System.in);
		CheckString anagram = new CheckString();
		
		string = scan.nextLine();
		
		if (!string.matches("[a-zA-Z]+")) {
			System.out.println("Input string must contain only letters!");
		} else {
			
			scan.close();
			
			quantAnagrams = anagram.maketest(string);
			
			System.out.println("Number of anagrams found: " + quantAnagrams);
		}
	}

}

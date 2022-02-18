package github.com.kanashiro.igor.desafio.capgemini.third;

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
		TestString anagram = new TestString();
		
		System.out.println("Type a word:");
		string = scan.nextLine();
		scan.close();
		
		quantAnagrams = anagram.maketest(string);
		
		System.out.println("Number of anagrams found: " + quantAnagrams);
	}

}

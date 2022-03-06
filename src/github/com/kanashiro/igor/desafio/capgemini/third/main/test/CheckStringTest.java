package github.com.kanashiro.igor.desafio.capgemini.third.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import github.com.kanashiro.igor.desafio.capgemini.third.main.CheckString;

public class CheckStringTest {

	private CheckString anagram;

	@BeforeEach
	public void initialize() {
		anagram = new CheckString();
	}
	
	@Test
	public void givenSmallString_whenMakingTestForAnagrams_returnNumberOfAnagrams() {
		String wordToBeTested = "ovo";
		int numberOfAnagramsInWordToBeTested = anagram.makeTest(wordToBeTested);
		
		assertEquals(2, numberOfAnagramsInWordToBeTested);
	}
	
	@Test
	public void givenMediumString_whenMakingTestForAnagrams_returnNumberOfAnagrams() {
		String wordToBeTested = "ifailuhkqq";
		int numberOfAnagramsInWordToBeTested = anagram.makeTest(wordToBeTested);
		
		assertEquals(3, numberOfAnagramsInWordToBeTested);
	}
}

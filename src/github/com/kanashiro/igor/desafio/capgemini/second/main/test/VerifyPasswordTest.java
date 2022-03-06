package github.com.kanashiro.igor.desafio.capgemini.second.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import github.com.kanashiro.igor.desafio.capgemini.second.main.VerifyPassword;

public class VerifyPasswordTest {

	private VerifyPassword verify;

	@BeforeEach
	public void initialize() {
		verify = new VerifyPassword();
	}
	
	@Test
	public void givenString_whenVerifyingPassword_returnTrue() {
		String givenPassword = "Ya3&ab";
		boolean checkPassword = verify.checkPassword(givenPassword);
		
		assertEquals(true, checkPassword);
	}
	
	@Test
	public void givenString_whenVerifyingPassword_returnFalseBecauseOfMinimumCharactersRequirement() {
		String givenPassword = "Ya3";
		boolean checkPassword = verify.checkPassword(givenPassword);
		
		assertEquals(false, checkPassword);
	}
	
	@Test
	public void givenString_whenVerifyingPassword_returnFalseBecauseOfLowerCaseRequirement() {
		String givenPassword = "YA3&AB";
		boolean checkPassword = verify.checkPassword(givenPassword);
		
		assertEquals(false, checkPassword);
	}
	
	@Test
	public void givenString_whenVerifyingPassword_returnFalseBecauseOfUpperCaseRequirement() {
		String givenPassword = "ya3&ab";
		boolean checkPassword = verify.checkPassword(givenPassword);
		
		assertEquals(false, checkPassword);
	}
	
	@Test
	public void givenString_whenVerifyingPassword_returnFalseBecauseOfNumberRequirement() {
		String givenPassword = "Yaa&ab";
		boolean checkPassword = verify.checkPassword(givenPassword);
		
		assertEquals(false, checkPassword);
	}
	
	@Test
	public void givenString_whenVerifyingPassword_returnFalseBecauseOfSpecialRequirement() {
		String givenPassword = "Ya33ab";
		boolean checkPassword = verify.checkPassword(givenPassword);
		
		assertEquals(false, checkPassword);
	}
}

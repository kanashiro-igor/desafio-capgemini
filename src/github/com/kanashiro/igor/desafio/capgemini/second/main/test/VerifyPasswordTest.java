package github.com.kanashiro.igor.desafio.capgemini.second.main.test;

import org.junit.platform.commons.annotation.Testable;

@Testable
public class VerifyPasswordTest {

	public void givenString_whenVerifyingPassword_returnTrueOrFalse() {
		
		String givenPassword = "Ya3&ab";
		String expectedPassword = "[a-zA-Z0-9!@#$%^&*()-+]+";
		
		
	}
}

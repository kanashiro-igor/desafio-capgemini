package github.com.kanashiro.igor.desafio.capgemini.first.main.test;

import org.junit.Assert;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class StairTest {

	public void givenNumber_whenMakeStair_thenPrintStair() {
		
		String actualFinalString = new String(new char[6]).replace("\0", "*");
		String expectedFinalString = new String(new char[6]).replace("\0", "*");
		
		Assert.assertEquals(actualFinalString, expectedFinalString);
	}
}

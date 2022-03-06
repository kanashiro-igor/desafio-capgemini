package github.com.kanashiro.igor.desafio.capgemini.first.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import github.com.kanashiro.igor.desafio.capgemini.first.main.Stair;


public class StairTest {

	@Test
	public void givenNumber_whenMakeStair_thenPrintStair() {
		
		Stair stair = new Stair();
		stair.makeStair(6);
		
		assertEquals("******", stair.getStars());
	}
}

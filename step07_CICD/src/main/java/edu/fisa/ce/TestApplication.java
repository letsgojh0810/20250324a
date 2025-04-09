package edu.fisa.ce;

import static org.junit.jupiter.api.Assertions.assertEquals;  // JUnit 5

import org.junit.jupiter.api.Test;

public class TestApplication {

	@Test
	public void testAddition() {
		int result = 2 + 3;
		
		System.out.println("##################전");
		assertEquals(5, result);  // 성공: 5 == 5
		System.out.println("##################후");
   }
}

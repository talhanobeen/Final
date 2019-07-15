package cui.atd.pk;

import static org.junit.Assert.*;

import org.junit.Test;

import pk.ciit.JunitMaven.BeforeClass;
import pk.ciit.JunitMaven.Calculator;

public class TestCalculator {
	private static Calculator calc;
	@BeforeClass
	public static void initCalculator(){
		calc = new Calculator();
	}
	@Test
	public void testPostiveNumbers(){
		int result = calc.findMax(3, 4,5);
		
		assertEquals(5, result);
	}
	@Test
	public void testNegativeNumbers(){
		int result = calc.findMax(-3, -4,-5);
		
		assertEquals(-3, result);
	}
	@Test
	public void testZero(){
		int result = calc.square(0);
		
		assertEquals(0, result);
	}
	@Test
	public void testNegativeSquareNumber(){
		int result = calc.square(-2);
		
		assertEquals(4, result);
	}
	@Test
	public void testPositiveSquareNumber(){
		int result = calc.square(2);
		
		assertEquals(4, result);
	}
	
	
}

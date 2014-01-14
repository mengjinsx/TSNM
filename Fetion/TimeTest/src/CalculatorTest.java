import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	private static Calculator calculator = new Calculator();


	@Test
	public void testAdd() {
		calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		 calculator.add(10);
	        calculator.substract(2);
	        assertEquals(8, calculator.getResult());
	}



	@Test
	public void testDivide() {
		  calculator.add(8);
	        calculator.divide(2);
	        assertEquals("hao", new String("hao"));
	}

	

}

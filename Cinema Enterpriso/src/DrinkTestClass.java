import static org.junit.Assert.*;

import org.junit.Test;

public class DrinkTestClass {

	DrinkFileReader drinkTester = new DrinkFileReader();
	private static final double DELTA = 1e-15;
	
	
	@Test
	public void testDisplayDrink() {
		drinkTester.openFile();
		drinkTester.readFile();
		String result = drinkTester.displayDrink(3);
		assertEquals("Large Fanta £3.00", result);
	}

	@Test
	public void testDisplayDrinkPrice() {
		drinkTester.openFile();
		drinkTester.readFile();
		Double result = drinkTester.displayDrinkPrice(3);
		assertEquals(3.0, result, DELTA);
	}

}

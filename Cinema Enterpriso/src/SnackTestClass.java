import static org.junit.Assert.*;

import org.junit.Test;

public class SnackTestClass {

	SnackFileReader snackTester = new SnackFileReader();
	private static final double DELTA = 1e-15;

	@Test
	public void testDisplaySnack() {
		snackTester.openFile();
		snackTester.readFile();
		String result = snackTester.displaySnack(1);
		assertEquals("Large Popcorn £3.00", result);
	}

	@Test
	public void testDisplaySnackPrice() {
		snackTester.openFile();
		snackTester.readFile();
		Double result = snackTester.displaySnackPrice(1);
		assertEquals(3.0, result,DELTA);
	}

}

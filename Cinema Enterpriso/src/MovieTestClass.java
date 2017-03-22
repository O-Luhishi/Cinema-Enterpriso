import static org.junit.Assert.*;

import org.junit.*;

public class MovieTestClass {


	FilmFileReader testerClass = new FilmFileReader();
	private static final double DELTA = 1e-15;
	

	@Test
	public void testDisplayFilmName() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmName(2);
		assertEquals("T2 Trainspotting", result);
	}

	@Test
	public void testDisplayFilmRating() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmRating(2);
		assertEquals("18", result);
	}

	@Test
	public void testDisplayAdultTicket() {
		testerClass.openFile();
		testerClass.readFile();
		double result = testerClass.displayAdultTicket(2);
		assertEquals(7.0,result, DELTA);
	}

	@Test
	public void testDisplayChildTicket() {
		testerClass.openFile();
		testerClass.readFile();
		double result = testerClass.displayChildTicket(2);
		assertEquals(5.0,result, DELTA);
	}

	@Test
	public void testDisplayNumberOfSeats() {
		testerClass.openFile();
		testerClass.readFile();
		int result = testerClass.displayNumberOfSeats(2);
		assertEquals(250, result);
	}

	@Test
	public void testDisplayTheatreRoom() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayTheatreRoom(2);
		assertEquals("CW-01-02",result);
	}

	@Test
	public void testDisplayTimeOfShow() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayTimeOfShow(2);
		assertEquals("9:00PM",result);
	}

	@Test
	public void testDisplayFilmImage() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmImage(2);
		assertEquals("T2Trainspotting.jpg",result);
	}
	
	@Test
	public void testDisplayFilmDate() {
		testerClass.openFile();
		testerClass.readFile();
		String result = testerClass.displayFilmDate(2);
		assertEquals("22/05/17",result);
	}


}

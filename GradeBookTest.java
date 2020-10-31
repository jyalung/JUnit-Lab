import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	GradeBook g;

	@Before
	public void setUp() throws Exception {
		g = new GradeBook(5);
		g.addScore(51);
		g.addScore(76);
	}

	@After
	public void tearDown() throws Exception {
		g = null;
	}

	@Test
	public void testAddScore() {
		assertEquals(2.0, g.getScoreSize(), 0.01);

        assertTrue(g.toString().equals("51.0 76.0 ")); 
	}

	@Test
	public void testSum() {
		assertEquals(127, g.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(51, g.minimum(), .0001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(76, g.finalScore(), .0001);
	}

}

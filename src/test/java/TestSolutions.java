import org.junit.jupiter.api.Test;
import problems.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSolutions {
	@Test
	void testProblem1() {
		assertEquals("233168", new Problem1().solve());
	}

	@Test
	void testProblem2() {
		assertEquals("4613732", new Problem2().solve());
	}

	@Test
	void testProblem3() {
		assertEquals("6857", new Problem3().solve());
	}

	@Test
	void testProblem4() {
		assertEquals("906609", new Problem4().solve());
	}

	@Test
	void testProblem5() {
		assertEquals("232792560", new Problem5().solve());
	}

	@Test
	void testProblem6() {
		assertEquals("25164150", new Problem6().solve());
	}

	@Test
	void testProblem7() {
		assertEquals("104743", new Problem7().solve());
	}

	@Test
	void testProblem8() {
		assertEquals("23514624000", new Problem8().solve());
	}

	@Test
	void testProblem9() {
		assertEquals("31875000", new Problem9().solve());
	}

	@Test
	void testProblem10() {
		assertEquals("142913828922", new Problem10().solve());
	}

	@Test
	void testProblem11() {
		assertEquals("70600674", new Problem11().solve());
	}

	@Test
	void testProblem12() {
		assertEquals("76576500", new Problem12().solve());
	}
}

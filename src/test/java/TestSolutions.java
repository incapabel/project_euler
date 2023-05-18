import org.junit.jupiter.api.Test;
import problems.Problem1;
import problems.Problem2;

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
}

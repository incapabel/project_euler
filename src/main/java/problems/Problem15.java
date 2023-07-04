package problems;

import utils.Problem;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/*
Starting in the top left corner of a 2x2 grid,
and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20x20 grid?
 */

public class Problem15 implements Problem {
	@Override
	public String solve() {
		System.out.println();

		return String.valueOf(recursiveSolution(0, 0, 20, BigInteger.ZERO));
	}

	private final Map<Point, BigInteger> cache = new HashMap<>();

	private record Point(int x, int y) {}

	public BigInteger recursiveSolution(int x, int y, int size, BigInteger solution) {
		if (cache.containsKey(new Point(x, y))) {
			return cache.get(new Point(x, y));
		}

		if (x == size || y == size) {
			return BigInteger.ONE;
		}

		if (x < size) {
			solution = solution.add(recursiveSolution(x + 1, y, size, BigInteger.ZERO));
		}

		if (y < size) {
			solution = solution.add(recursiveSolution(x, y + 1, size, BigInteger.ZERO));
		}

		cache.put(new Point(x, y), solution);

		return solution;
	}
}

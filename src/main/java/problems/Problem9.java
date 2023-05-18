package problems;

import utils.Problem;

/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Problem9 implements Problem {
	@Override
	public String solve() {
		for (int c = 0; c < 1000; c++) {
			for (int b = 0; b < c; b++) {
				for (int a = 0; a < b; a++) {
					if (
						(a * a) + (b * b) == c * c &&
							(a + b + c == 1000)
					) {
						return String.valueOf(a * b * c);
					}
				}
			}
		}

		return null;
	}
}

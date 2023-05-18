package problems;

import utils.Problem;
import utils.Util;

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */

public class Problem10 implements Problem {
	@Override
	public String solve() {
		long solution = 0;

		for (int i = 0; i < 2_000_000; i++) {
			if (Util.isPrime(i)) {
				solution += i;
			}
		}

		return String.valueOf(solution);
	}
}

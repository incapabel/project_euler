package problems;

import utils.Problem;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3 implements Problem {
	@Override
	public String solve() {
		long n = 600851475143L;
		while (true) {
			long p = smallestFactor(n);

			if (p < n) {
				n /= p;
			} else {
				return Long.toString(n);
			}
		}
	}

	private long smallestFactor(long n) {
		if (n <= 1) {
			throw new IllegalArgumentException();
		}

		for (long i = 2, end = (int) Math.sqrt(n); i <= end; i++) {
			if (n % i == 0) {
				return i;
			}
		}
		return n;
	}
}

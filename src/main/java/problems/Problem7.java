package problems;

import utils.Problem;
import utils.Util;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class Problem7 implements Problem {
	@Override
	public String solve() {
		int count = 0;
		for (int i = 2; ; i++) {
			if (Util.isPrime(i)) {
				count++;
				if (count == 10001) {
					return Integer.toString(i);
				}
			}
		}
	}
}

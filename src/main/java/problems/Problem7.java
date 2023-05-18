package problems;

import utils.Problem;

/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */

public class Problem7 implements Problem {
	@Override
	public String solve() {
		int count = 0;
		for (int i = 2; ; i++) {
			if (isPrime(i)) {
				count++;
				if (count == 10001) {
					return Integer.toString(i);
				}
			}
		}
	}

	private boolean isPrime(int x) {
		if (x == 0 || x == 1) {return false;} else if (x == 2) {return true;} else {
			if (x % 2 == 0) {return false;}
			for (int i = 3, end = (int) Math.sqrt(x); i <= end; i += 2) {
				if (x % i == 0) {return false;}
			}
			return true;
		}
	}
}

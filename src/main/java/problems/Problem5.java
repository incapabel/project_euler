package problems;

import utils.Problem;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 implements Problem {
	@Override
	public String solve() {
		int idx = 10;
		while (true) {
			idx++;

			boolean next = false;
			for (int i = 2; i <= 20; i++) {
				if (idx % i != 0) {
					next = true;
					break;
				}
			}

			if (!next) {
				return String.valueOf(idx);
			}
		}
	}
}

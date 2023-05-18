package problems;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

import utils.Problem;

public class Problem4 implements Problem {
	@Override
	public String solve() {

		int solution = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				int number = i * j;

				if (number < solution) {
					continue;
				}

				String chars = String.valueOf(number);

				StringBuilder first  = new StringBuilder(chars.substring(0, chars.length() / 2));
				StringBuilder second = new StringBuilder(chars.substring(chars.length() / 2));

				if (first.toString().contentEquals(second.reverse())) {
					solution = Math.max(number, solution);
				}
			}
		}

		return String.valueOf(solution);
	}
}

package problems;

import utils.Problem;
import utils.Util;

import java.math.BigInteger;

/*
n! means n * (n - 1) * ... * 3 * 2 * 1.

For example:
10! = 10 * 9 * ... * 3 * 2 * 1 = 3 628 800
and the sum of the digits in the number 10! is
3 + 6 + 2 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!.
 */

public class Problem20 implements Problem {
	@Override
	public String solve() {
		return String.valueOf(
			sumOfDigits(
				Util.factorial(100)
			)
		);
	}

	private int sumOfDigits(BigInteger number) {
		String str    = String.valueOf(number);
		int    length = str.length();

		int result = 0;
		for (int i = 0; i < length; i++) {
			result += Integer.parseInt(str, i, i + 1, 10);
		}

		return result;
	}
}

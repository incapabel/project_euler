package problems;

import utils.Problem;

import java.math.BigInteger;

/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26
What is the sum of the digits of the number 2^1000?
 */

public class Problem16 implements Problem {
	@Override
	public String solve() {
		int    solution = 0;
		String number   = BigInteger.ONE.shiftLeft(1000).toString();

		int length = number.length();
		for (int i = 0; i < length; i++) {
			solution += Integer.parseInt(String.valueOf(number.charAt(i))); //probably better way but fast enough
		}

		return String.valueOf(solution);
	}
}

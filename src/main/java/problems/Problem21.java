package problems;

import utils.Problem;

/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a =/= b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all amicable numbers under 10 000.
 */

public class Problem21 implements Problem {
	@Override
	public String solve() {
		int solution = 0;

		for (int i = 1; i < 10_000; i++) {
			solution += amicableNumberPair(i);
		}

		return String.valueOf(solution);
	}

	private int amicableNumberPair(int number) {
		int n1 = sumOfDivisors(number);

		if (n1 == number) {
			return 0;
		}

		int n2 = sumOfDivisors(n1);

		if (n2 != number) {
			return 0;
		}

		return number;
	}

	private int sumOfDivisors(int number) {
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		return sum;
	}
}

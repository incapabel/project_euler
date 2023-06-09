package problems;

/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
 */

import org.jetbrains.annotations.NotNull;
import utils.Problem;

import java.math.BigInteger;

public class Problem14 implements Problem {
	private static final BigInteger CACHE_SIZE = BigInteger.valueOf(1_000_000);

	private final int[] chainLength = new int[CACHE_SIZE.intValue()];

	@Override
	public String solve() {
		int solution     = 0;
		int longestChain = 0;

		for (int i = 2; i < 1_000_000; i++) {
			int chain = chainLength(BigInteger.valueOf(i));

			if (chain > longestChain) {
				longestChain = chain;
				solution = i;
			}
		}

		return String.valueOf(solution);
	}

	private int chainLength(@NotNull BigInteger n) {
		if (n.compareTo(CACHE_SIZE) >= 0) {
			return chainLengthDirect(n);
		}

		int idx = n.intValue();
		if (chainLength[idx] == 0) {
			chainLength[idx] = chainLengthDirect(n);
		}

		return chainLength[idx];
	}

	private int chainLengthDirect(@NotNull BigInteger n) {
		if (n.equals(BigInteger.ONE)) {
			return 1;
		}
		if (n.testBit(0)) {
			return chainLength(n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)) + 1;
		}
		return chainLength(n.shiftRight(1)) + 1;
	}
}

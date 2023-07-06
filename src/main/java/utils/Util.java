package utils;

import java.math.BigInteger;

public class Util {
	private Util() {}

	public static boolean isPrime(int x) {
		if (x == 0 || x == 1) {return false;}
		else if (x == 2) {return true;}
		else {
			if (x % 2 == 0) {return false;}
			for (int i = 3, end = (int) Math.sqrt(x); i <= end; i += 2) {
				if (x % i == 0) {return false;}
			}
			return true;
		}
	}

	public static BigInteger factorial(long number) {
		BigInteger result = BigInteger.ONE;
		for (; number > 0; number--) {
			result = result.multiply(BigInteger.valueOf(number));
		}
		return result;
	}
}

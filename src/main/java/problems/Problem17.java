package problems;

import utils.Problem;

/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five,
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens.
For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.
 */

public class Problem17 implements Problem {
	private static final String[] ONES = {
		"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
		"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	};

	private static final String[] TENS = {
		"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
	};

	public String solve() {
		int solution = 0;

		for (int i = 1; i <= 1000; i++) {
			solution += convertToWord(i).length();
		}

		return String.valueOf(solution);
	}

	private static String convertToWord(int i) {
		if (i >= 0 && i < 20) {
			return ONES[i];
		}

		else if (i >= 20 && i < 100) {
			return TENS[i / 10] + (i % 10 != 0 ? ONES[i % 10] : "");
		}

		else if (i >= 100 && i < 1000) {
			return ONES[i / 100] + "hundred" + (i % 100 != 0 ? "and" + convertToWord(i % 100) : "");
		}

		else if (i >= 1000 && i < 1000000) {
			return convertToWord(i / 1000) + "thousand" + (i % 1000 != 0 ? convertToWord(i % 1000) : "");
		}

		throw new IllegalArgumentException("given number is too larger");
	}
}

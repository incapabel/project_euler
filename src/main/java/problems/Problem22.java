package problems;

import utils.Problem;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Using names.txt a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
So, COLIN would obtain a score of 938 * 53 = 49 714
 */

public class Problem22 implements Problem {
	private final Map<Character, Integer> alphabetCache = new HashMap<>();

	@Override
	public String solve() {
		String[] names = loadFileAsString();

		Arrays.sort(names);

		char[] alphabet = {
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
			'V', 'W', 'X', 'Y', 'Z'
		};

		for (int i = 0; i < alphabet.length; i++) {
			alphabetCache.put(alphabet[i], i + 1);
		}

		long solution = 0;
		for (int i = 0; i < names.length; i++) {
			long newScore = calculateNameScore(names[i]);

			newScore *= i + 1;

			solution += newScore;
		}

		return String.valueOf(solution);
	}

	private String[] loadFileAsString() {
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream("names.txt");

		assert inputStream != null;
		try (Scanner scanner = new Scanner(inputStream)) {
			StringBuilder data = new StringBuilder();
			while (scanner.hasNextLine()) {
				data.append(scanner.nextLine());
			}
			return data.toString().replace("\"", "").split(",");
		}
	}

	private int calculateNameScore(String name) {
		char[] nameChars = name.toCharArray();

		int sum = 0;
		for (char c : nameChars) {
			sum += alphabetCache.get(c);
		}

		return sum;
	}
}

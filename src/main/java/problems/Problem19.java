package problems;

import utils.Problem;

/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

public class Problem19 implements Problem {
	@Override
	public String solve() {
		int daysPassed = 1;

		int solution = 0;

		for (int year = 1901; year <= 2000; year++) {
			for (int month = 1; month <= 12; month++) {
				if (isSunday(daysPassed)) {
					solution++;
				}

				daysPassed += daysInMonth(month, year);
			}
		}

		return String.valueOf(solution - 1);
	}

	private boolean isSunday(int day) {
		return day % 7 == 0;
	}

	private int daysInMonth(int month, int year) {
		return switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> 31;
			case 2 -> leapYear(year) ? 29 : 28;
			case 4, 6, 9, 11 -> 30;
			default -> throw new IllegalArgumentException("Invalid month");
		};
	}

	private boolean leapYear(int year) {
		if (year % 100 == 0) {
			return year % 400 == 0;
		}

		return year % 4 == 0;
	}
}

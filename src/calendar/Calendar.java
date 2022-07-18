package calendar;

public class Calendar {
	private static final int[] Last_Day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] Leap_Last_Day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getLastDayOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return Leap_Last_Day[month - 1];
		} else {
			return Last_Day[month - 1];			
		}
	}

	public void printCalendar(int month) {
		System.out.println(" SU MO TU WE TH FR SA\r\n" + "---------------------");

		for (int i = 1; i <= month; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
}

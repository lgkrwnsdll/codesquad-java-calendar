package calendar;

public class Calendar {
	private static final int[] Last_Day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getLastDayOfMonth(int month) {
		return Last_Day[month - 1];
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

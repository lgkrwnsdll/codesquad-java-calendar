package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] Last_Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getLastDayOfMonth(int month) {
		return Last_Day[month - 1];
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("반복횟수를 입력하세요: ");
		int repeat = scanner.nextInt();
		
		for (int i = 0; i < repeat; i++) {
			System.out.println("수를 입력하세요: ");
			int month = scanner.nextInt();
			System.out.printf("해당 월은 %d일로 구성됩니다.\n", cal.getLastDayOfMonth(month));			
		}
		System.out.println("Complete");
		scanner.close();
	}
}

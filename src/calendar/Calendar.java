package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] Last_Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getLastDayOfMonth(int month) {
		return Last_Day[month - 1];
	}
	
	public static void main(String[] args) {
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while (true) {
			System.out.println("수를 입력하세요: ");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month < 1) {
				break;
			} else if (month > 12) {
				continue;
			}
			
			System.out.printf("해당 월은 %d일로 구성됩니다.\n", cal.getLastDayOfMonth(month));			
		}
		System.out.println("Complete");
		scanner.close();
	}
}

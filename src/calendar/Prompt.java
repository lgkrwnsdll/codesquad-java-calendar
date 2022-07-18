package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("수를 입력하세요: ");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			int lastday = cal.getLastDayOfMonth(month);
			cal.printCalendar(lastday);
		}
		System.out.println("Complete");
		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}

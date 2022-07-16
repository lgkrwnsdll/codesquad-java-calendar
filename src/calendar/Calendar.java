package calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하세요: ");
		int month = scanner.nextInt();
		
		
		System.out.printf("해당 월은 %d일로 구성됩니다.", days[month - 1]);
		scanner.close();
	}
}

package makethemequal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int test_case, number, sum ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 1; i < test_case; i++) {
			System.out.println("Nhập chiều dài của mảng");
			number = scanner.nextInt();
			sum = 0;
			System.out.println("Nhập giá trị của chuỗi");
			for (int j = 1; j <= number; j++) {
				int temp = scanner.nextInt();
				sum+= temp;
			}
			if (sum%number ==0) {
				System.out.println(number);
			}
			else {
				System.out.println(number-1);
			}
		}
	}
}

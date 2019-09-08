package divisiorsummation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test_case, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 0; i <= test_case; i++) {
			System.out.println("Nhấp số n ");
			n =scanner.nextInt();
			int sum = 0;
			for (int j = 1; j < n; j++) {
				if (n%j == 0) {
					sum += j;
				}
			}
			System.out.println(sum);
		}
	}

}

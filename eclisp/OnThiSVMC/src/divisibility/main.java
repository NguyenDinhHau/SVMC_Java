package divisibility;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test_case, n, x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 1; i <= test_case; i++) {
			System.out.println("Nhập n");
			n = scanner.nextInt();
			System.out.println("Nhập x");
			x = scanner.nextInt();
			System.out.println("Nhập y");
			y = scanner.nextInt();
			int number = x;
			while(number<n) {
				if (number%y != 0) {
					System.out.println(number);
				}
				number += x;
			}
		}

	}

}

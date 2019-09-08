package bai3maketheequal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int test_case, len, sum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 1; i <= test_case; i++) {
			System.out.println("Nhập chiều dài mảng");
			len = scanner.nextInt();
			sum = 0;
			for (int j = 1; j < len; j++) {
				int temp;
				temp = scanner.nextInt();
				sum +=temp;
			}
			if (sum%len!= 0 ) {
				System.out.println("số " + (len-1));
			}
			else
				System.out.println("so "+ len);
		}

	}

}

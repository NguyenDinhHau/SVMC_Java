package bai2makearray;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] mang =  new int[50000];
		int min, max, test_case, number, len;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập test_case");
		test_case = scanner.nextInt();
		for (int i = 1; i <= test_case; i++) {
			System.out.println("Nhập chiều dài mảng");
			len = scanner.nextInt();
			min = 50000;
			max = 0;
			int result = 0;
			for (int j = 1; j <= len; j++) {
				number = scanner.nextInt();
				if (number <min) {
					min = number;
				}
				if (number > max) {
					max = number;
				}
				mang[number]++;
			}
			int count = 0;
			for (int m = min; m <= max; m++) {
				if (mang[m]==0) {
					continue;
				}
				count += mang[m];
				result += count*mang[m];
			}
			System.out.println(result);
		}
	}

}

package powerofarray;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int number_test, n, number, number_len, result;
	int[] mang = new int[50001];
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập số lượng test case");
	number_test = scanner.nextInt();
	for (int m = 1; m <= number_test; m++) {
		System.out.println("nhập chiều dài mảng");
		n = scanner.nextInt();
		int min = 50000;
		result = 0;
		int max = 0;
		number_len = n;
		for (int i = 1; i <= n; i++) {
			number = scanner.nextInt();
			if (number <min) {
				min = number;
			}
			if (number> max) {
				max = number;
			}
			mang[number]++;
		}
		int count = 0;
		for (int k =min; k <= max; k++) {
			if (mang[k]==0) {continue;}
			count = count + mang[k];
			result += count*mang[k];
			
		}
		System.out.println(result);
	}
}
}

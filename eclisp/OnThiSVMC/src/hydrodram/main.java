package hydrodram;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int test_case, n,indext_max,sum, left_max, right_max, max_box;
		int[] mang = new int[10010];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 0; i < test_case; i++) {
			System.out.println("Nhập chiều dài của mảng");
			n = scanner.nextInt();
			sum = 0;
			System.out.println("Nhập độ dài của đập");
			for (int j = 1; j <= n; j++) {
				mang[j] = scanner.nextInt();
			}
			indext_max = 0;
			max_box = 0;
			for (int m = 1; m <= n; m++) {
				if (mang[m] > max_box) {
					max_box = mang[m];
					indext_max = m;
				}
			}
			left_max  = mang[1];
			for (int l = 2; l < indext_max; l++) {
				if (mang[l]> left_max) {
					left_max = mang[l];
					continue;
				}
				sum = sum + (left_max - mang[l]);
			}
			right_max = mang[n];
			for (int r = n ; r > indext_max; r--) {
				if (mang[r] > right_max) {
					right_max = mang[r];
					continue;
				}
				sum = sum + (right_max - mang[r]);
			}
			System.out.println(sum);
		}

	}

}

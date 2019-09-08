package bai1hydro;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class main {

	public static void main(String[] args) {
		int[] mang = new int[50003];
		int test_case, n, len, number, min, max;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 1; i <= test_case; i++) {
			System.out.println("Nhập chiều dài mảng");
			n = scanner.nextInt();
			min = 50003;
			max = 0;
			len = n;
			for (int j = 0; j < n; j++) {
				number = scanner.nextInt();
				if (number < min) {
					min = number;
				}
				if (number> max) {
					max = number;
				}
				mang[number] ++;
			}
			int count = 0;
			for (int z = min; z <= max; z++) {
				if (mang[z]==0) {
					continue;
				}
				count = count + mang[z];
				result += count*mang[z];
			}
			System.out.println(result);
			
		}
		
	}
		//		int[] mang = new int[50003];
//		int min, max, number_test, len, number;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập số lượng test case");
//		number_test = scanner.nextInt();
//		for (int i = 1; i <= number_test; i++) {
//			int result = 0;
//			max = 0;
//			min = 50000;
//			System.out.println("Nhập chiều dài mảng");
//			len = scanner.nextInt();
//			
//			for (int j = 1;j<= len; j++) {
//				System.out.println("Nhập số " + j);
//				number = scanner.nextInt();
//				if (number< min)min = number;
//				if (number > max)max = number;
//				mang[number]++;
//			}
//			int count = 0;
//			for (int m = min; m <= max; m++) {
//				if (mang[m]==0)continue;
//				count = count + mang[m];
//				result += count*mang[m];
//			}
//			System.out.println(result);
//		}
//	}

}

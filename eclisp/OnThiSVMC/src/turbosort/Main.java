package turbosort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int test_case, s,number;
		int[] mang = new int[10000];
		System.out.println("Nhap so luowng test  case");
		test_case = scanner.nextInt();
		for (int i = 0; i < test_case; i++) {
			System.out.println("nhap so luong so can chuye");
			s = scanner.nextInt();
			for (int j = 0; j < s; j++) {
				System.out.println("Nhap so thu "+ j);
				number = scanner.nextInt();
				mang[number]++;
			}
			for (int j1 = 0; j1 < 10000; j1++) {
				while(mang[j1]>0) {
					System.out.println(j1);
					mang[j1]--;
				}
			}
		}
	}

}

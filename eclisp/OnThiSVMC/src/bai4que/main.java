package bai4que;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] mang = new int[1001];
		int[] indexMang = new int[1001];
		int[] mangchua = new int[1001];
		int test_case, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhấp số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 1; i <= test_case; i++) {
			System.out.println("Nhập số lượng mảng");
			n = scanner.nextInt();
			
			for (int j = 0; j < n; j++) {
				System.out.println("Nhập phần tử mảng" + j);
				mang[j] = scanner.nextInt();
			}
			Sorf(mang);
			System.out.println("Kết Quả");
			for (int l = 0; l < mang.length; l++) {
				System.out.print(mang[l] + "\t" );
			}
		}
		// TODO Auto-generated method stub
		
	}
	public static void Sorf(int[] mang1) {
		int tempt= mang1[0];
		for (int i = 0; i < mang1.length-1; i++) {
			for (int j = i+1; j < mang1.length; j++) {
				if (mang1[i]>mang1[j]) {
					tempt = mang1[j];
					mang1[j] = mang1[i];
					mang1[i] = tempt;
				}
				
			}
		}
		
	}

}

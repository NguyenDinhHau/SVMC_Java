package queee;

import java.util.Scanner;

public class Main {
	static int[] mang1;
	static int[] indext;
	static int n;
	public static void main(String[] args) {
		int test_case;
		mang1 = new int[1005];
		indext = new int[1005];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		
		for (int i = 0; i < test_case; i++) {
			System.out.println("nhấp chiều dài mảng");
			n = scanner.nextInt();
			System.out.println("Nhập giá trị mảng");
			for (int j = 0; j < n; j++) {
				mang1[j] = scanner.nextInt();
			}
			System.out.println("Nhập vị trí của phần tử");
			for (int j = 0; j < n; j++) {
				indext[j] = scanner.nextInt();
			}
			sort();
			select();
		}
	}
	public static void sort() {
		int temp;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (mang1[j] >mang1[i]) {
					temp =mang1[i];
					mang1[i] = mang1[j];
					mang1[j] = temp;
					
					temp = indext[i];
					indext[i] = indext[j];
					indext[j] = temp;
				}
			}
		}
	}
	public static void select() {
		int temp ;
		for (int i = 0; i < n; i++) {
			if (indext[i] != i) {
				for (int j = i; j >indext[i]; j--) {
					temp = mang1[j];
					mang1[j] = mang1[j-1];
					mang1[j-1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(mang1[i] + "\t");
		}
	}
	

}

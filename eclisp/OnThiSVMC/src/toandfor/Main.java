package toandfor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String a;
	char[] b = new char[1000];
	char[][] mang = new char[100][100];
	int test_case, tempt, t,len;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap so luong test case");
	test_case = scanner.nextInt();
	for (int i = 0; i < test_case; i++) {
		System.out.println("Nhap so hang cua test case");
		t = scanner.nextInt();
		scanner.nextLine();
		System.out.println("mang");
		a = scanner.nextLine();
		len = a.length();
		tempt = 0;
		b = a.toCharArray();
		int m = len/t;
		
		for (int j = 1; j <= m; j++) {
			for (int j2 = 1; j2 <= t; j2++) {
				if (j%2 == 0) {
					mang[j][t-j2+1] = b[tempt];
					tempt++;
				}
				else {
					mang[j][j2] = b[tempt];
					tempt++;
				}
			}
		}
		for (int l = 1; l <= m; l++) {
			for (int s = 1; s <= t; s++) {
				System.out.print(mang[l][s]);
			}
			System.out.println();
		}
//		System.out.println("nguyen dinh hau");
//		for (int h = 1; h <= t; h++) {
//			for (int k = 1; k <= m; k++) {
//				System.out.print(mang[k][h]);
//			}
//		}
	}
	}

}

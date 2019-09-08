package primegenerator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test_case, n, m;
		boolean isPrime;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập test case");
		test_case = scanner.nextInt();
		for (int i = 1; i < test_case; i++) {
			System.out.println("Mời bạn nhập n");
			n = scanner.nextInt();
			System.out.println("Mời bạn nhập m");
			m = scanner.nextInt();
			for (int j = n; j <= m; j++) {
				if (j>1) {
					isPrime = true;
				for (int j2 = 2; j2 < j; j2++) {
					if (j%j2==0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(j);
				}
				}
			}
		}
	}

}

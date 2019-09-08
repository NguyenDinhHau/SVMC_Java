package primegenarator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_test, n, m;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		number_test = scanner.nextInt();
		for (int i = 1; i < number_test; i++) {
			System.out.println("Nhập số thứ nhất");
			n = scanner.nextInt();
			System.out.println("Nhập số thứ 2");
			m = scanner.nextInt();
			for (int j = n; j <= m; j++) {
				if (j > 1) {
					boolean isPrime = true;
						for (int k = 2; k <= Math.sqrt(j); k++) {
							if (j%k == 0) {
								isPrime = false;
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

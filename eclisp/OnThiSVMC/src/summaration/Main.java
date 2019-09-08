package summaration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number_test, n, sum;
		System.out.println("nhập số lượng test case");
		number_test = scanner.nextInt();
		for (int i = 1; i < number_test; i++) {
			sum = 0;
			System.out.println("Nhập số n");
			n = scanner.nextInt();
			for (int j = 1; j < n; j++) {
				if (n%j ==0) {
					int tempt = j;
					sum += tempt;
				}
			}
			System.out.println(sum);
		}
	}

}

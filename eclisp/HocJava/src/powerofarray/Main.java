package powerofarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test_case, number, number_ele, sum;
		int[] mang = new int[10000];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 0; i <test_case; i++) {
			System.out.println("Nhập chiều dài của dãy");
			number_ele  = scanner.nextInt();
			sum = 0;
			int min = 10000;
			int max = 0;
			System.out.println("Nhập số ");
			for (int j = 0; j < number_ele; j++) {
				number = scanner.nextInt();
				if (number < min) {
					min = number;
				}
				if (number >max) {
					max = number;
				}
				mang[number]++;
			}
			int count = 0;
			for (int j = min; j <= max; j++) {
				if (mang[j] == 0) {
					continue;
				}
				count = count + mang[j];
				sum +=  count*mang[j];
				
			}
			System.out.println(sum);
		}
	}

}

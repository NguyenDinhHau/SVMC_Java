package streetparada;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_test, index_top, index, n;
		int[] mang = new int[1005];
		Scanner   scanner = new Scanner(System.in);
		boolean isRange;
		System.out.println("Nhập số lượng test case");
		number_test = scanner.nextInt();
		for (int i = 1; i <= number_test; i++) {
			Stack<Integer> base = new Stack<Integer>();
			Stack<Integer> temp = new Stack<Integer>();
			index = 1;
			isRange = true;
			System.out.println("Nhập chiều dài của mang");
			n = scanner.nextInt();
			System.out.println("Nhập giá trị của phần tử mảng");
			for (int j = 0; j < n; j++) {
				mang[j] = scanner.nextInt();
			}
			for (int p = n-1; p <= 0; p++) {
				base.push(mang[p]);
			}
			while(!base.isEmpty()) {
				index_top = base.peek();
				if (index_top!= index) {
				if (!temp.isEmpty()) {
					if (!temp.isEmpty() && temp.peek() == index) {
						index ++;
						temp.pop();
					}
					if (!temp.isEmpty() && index_top > temp.peek()) {
						isRange = false;
						break;
					}
				}
				else {
					temp.push(index_top);
				}
				}
				else {
					index++;
			}
				base.pop();
		}
			if (isRange == true) {
				System.out.println("yes");
			}
			if (isRange == false) {
				System.out.println("No");
			}
		}
	}

}

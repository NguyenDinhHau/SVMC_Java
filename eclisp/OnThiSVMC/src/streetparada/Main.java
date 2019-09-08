package streetparada;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	int index, indext_top, numbera_test, number_struct;
	boolean isArange;
	int[] indext_car = new int[1005];
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập số lượng test case");
	numbera_test = scanner.nextInt();
	for (int i = 0; i < numbera_test; i++) {
		System.out.println("Nhập số lượng xe");
		number_struct = scanner.nextInt();
		index = 1;
		isArange = true;
		Stack<Integer> base = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();
		System.out.println("Nhập vị trí của các xe");
		for (int j = 0; j <number_struct; j++) {
			indext_car[i] = scanner.nextInt();
		}
		for (int j1 = number_struct-1; j1>=0; j1--) {
			base.push(indext_car[j1]);
		}
		while(!base.empty()) {
			indext_top = base.peek();
			if (indext_top != index) {
				if (!temp.empty()) {
					while(!temp.empty() && temp.peek() == index) {
						index++;
						temp.pop();
					}
					if (!temp.empty() && indext_top>temp.peek()) {
						isArange = false;
						break;
					}
				}
				temp.push(indext_top);
			}
			else {
				index++;
			}
			base.pop();
		}
		if (isArange) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	}
}

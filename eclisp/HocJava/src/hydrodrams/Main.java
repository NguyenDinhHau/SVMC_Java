package hydrodrams;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {
	public static void main(String[] args) {
		int index_max, max_index, test_case, number, left_index, righ_index, sum;
		int[] mang = new int[1000];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		test_case = scanner.nextInt();
		for (int i = 0; i < mang.length; i++) {
			System.out.println("Nhập chiều dài của mảng");
			number  = scanner.nextInt();
			sum = 0;
			
			System.out.println("Nhập phần tử mảng");
			for (int j = 0; j < number; j++) {
				mang[j] = scanner.nextInt();
			}
			index_max = 0;
			max_index =  mang[0];;
			for (int j = 1; j < number; j++) {
				if (mang[j] > max_index) {
					max_index = mang[j];
					index_max = j;
				}
			}
			left_index = mang[0];
			for (int j = 1; j < index_max; j++) {
				if (mang[j] > left_index) {
					left_index = mang[j];
					continue;
				}
				sum = sum +(left_index - mang[j]);
			}
			righ_index = mang[number-1];
			for (int j= number-2; j > index_max; j--) {
				if (mang[j] > righ_index) {
					righ_index = mang[j];
					continue;
				}
				sum = sum + (righ_index - mang[j]);
			}
			System.out.println(sum);
		}
	}
	
}

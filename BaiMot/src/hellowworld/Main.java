package hellowworld;

import java.math.MathContext;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import huongdoituong.ConMeo;

public class Main {

	public static void main(String[] args) {
		nhap();
	}
	public static void nhap() {
		ConMeo conMeo = new ConMeo();
		conMeo.getTiengnoi();
		conMeo.tien
		// nó gọi cái này là phương thức, gần giống hàm.
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Nhập");
		int[][] m = new int[2][3]; // dùng đến matran
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				try {
					m[i][j] = scanner.nextInt();
				} catch (Exception e) {
				System.out.println("Nhập số");
				}
					
			}
		}
	}
}

package mirrorstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m;
		char[] a;
		int number_test, leng, len_sub, numberAnswer=0;
		boolean finish;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		number_test = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < number_test; i++) {
			System.out.println("Nhập chuỗi");
			
			m = scanner.nextLine();
			leng = m.length();
			len_sub = leng;
			a = m.toCharArray();
			while(true) {
				finish = false;
			for (int j = 0; j < leng; j++) {
				if (j+len_sub >leng) {
					break;
				}
				if (len_sub == 1 || len_sub==2 && a[j] == a[j+1]) {
					numberAnswer++;
					finish = true;
				}
				else {
					boolean check = true;
					for (int k = 0; k <= (len_sub-1)/2; k++) {
						if (a[k+j] != a[len_sub-1-k+j]) {
							check = false;
							break;
						}
					}
					if (check== true) {
						numberAnswer++;
						finish = true;
					}
				}
			}
			if (len_sub == 1) {
				break;
			}
			if (finish) {
				break;
			}
			len_sub--;
				
			}
			System.out.println(numberAnswer + " " + len_sub);
		}
	}
}
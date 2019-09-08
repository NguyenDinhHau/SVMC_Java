package hfloor;

import java.util.Scanner;

public class MAIN {
	static int[] x = {0,-1,1,0};
	static int[] y = {1,0,0,-1};
	static int[][] matrix;
	static int[][] visited;
	static void viruts_haha(int i, int j, int temp) {
		visited[i][j] = temp;
		for (int k = 0; k < 4; k++) {
			int index_x = i+x[k];
			int index_y = j+y[k];
			if (matrix[index_x][index_y]==2) {
				if (visited[index_x][index_y]==0) {
					viruts_haha(index_x, index_y, temp);
				}
			}
		}
	}
public static void main(String[] args) {
	visited = new int[100][100];
	matrix = new int[100][100];
	int numbet_test, row, col, count_room, cout_human;
	String row_txt;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập số lượng test case");
	numbet_test = scanner.nextInt();
	for (int i = 0; i < numbet_test; i++) {
		System.out.println("Nhập chiều dài của dòng");
		row = scanner.nextInt();
		System.out.println("Nhập chiều dài của cột");
		col = scanner.nextInt();
		scanner.nextLine();
		cout_human = 0;
		count_room= 0;
		for (int j = 0; j <row; j++) {
			System.out.println("Nhập chuỗi của dòng");
			row_txt = scanner.nextLine();
			char[] text = row_txt.toCharArray();
			int check_room = 0;
			for (int z = 0; z < col; z++) {
				if (text[j]=='#') {
					matrix[j][z] = 2;
					if (text[z]=='*') {
						cout_human++;
					}
					if (check_room ==1) {
						count_room++;
						matrix[j][z] =1;
						check_room = 0;
					}
				}
				else {
					check_room = 1;
				}
				}
			}
		int temp = 0;
		for (int j1 = 1; j1 <row-1 ; j1++) {
			for (int j2 = 0; j2 < col; j2++) {
				if (visited[j1][j2]!=0) {
					continue;
				}
				if (matrix[j1][j2]==2) {
					temp++;
					viruts_haha(j1, j2, temp);
				}
			}
		}
		System.out.println(cout_human/temp);
		}
	}
}

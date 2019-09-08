package quenandpawn;

import java.awt.Menu;
import java.util.Scanner;

public class main {
	static int[] pos_knight_x = {-2,-1,-2,-1,1,2,2,1};
	static int[] pos_knight_y = {-1-2,1,2,2,-1,1,-1};
	static int[] pos_queen_x = {0,1,1,1,0,-1,-1,-1};
	static int[] pos_queen_y = {1,1,0,-1,-1,-1,0,1};
	
	static int[][] chess = new int[101][101];
	public static void memset(int[][] mang, int so, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mang[i][j] = 0;			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x_queen = null, y_queen = null, y_knigh = null,pawn_x= null, pawn_y = null, x_knight = null;
		int number_queen, number_night, number_pawn, count = 0;
		int test_case,x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng test case");
		
		test_case = scanner.nextInt();
		for (int i = 1; i <= test_case; i++) {
			System.out.println("Nhập số lượng row");
			x = scanner.nextInt();
			System.out.println("Nhập số lượng col");
			y = scanner.nextInt();
			if (x==0 && y==0) {
				break;
			}
			memset(chess, 0, x, y);
			System.out.println("Nhập số lượng Queen");
			number_queen = scanner.nextInt();
			for (int q = 1; q <= number_queen; q++) {
				System.out.println("Nhập tọa độ của queen "+ q);
				x_queen[q] = scanner.nextInt();
				y_queen[q] = scanner.nextInt();
				chess[x_queen[q]][y_queen[q]] = 1;
			}
			System.out.println("Nhập số lương Knight");
			number_night = scanner.nextInt();
			for (int ni = 1; ni <= number_night; ni++) {
				System.out.println("Nhập tọa độ của Knight");
				x_knight[ni] = scanner.nextInt();
				y_knigh[ni] = scanner.nextInt();
				chess[x_knight[ni]][y_knigh[ni]] = 1;
			}
			System.out.println("Nhập số lượng của pawn");
			number_pawn = scanner.nextInt();
			for (int pa = 1; pa <= number_pawn; pa++) {
				System.out.println("Nhập tọa độ của Pawn " + pa);
				pawn_x[pa] = scanner.nextInt();
				pawn_y[pa] = scanner.nextInt();
				chess[pawn_x[pa]][pawn_y[pa]] = 1;
			}
			for (int nq = 0; nq < number_queen; nq++) {
				for (int j = 0; j < 8; j++) {
					int xx = x_queen[nq] + pos_queen_x[j];
					int yy = y_queen[nq] + pos_queen_y[j];
					while (xx >= 1 && xx <= x&& yy>= 1 && yy<y) {
						if (chess[xx][yy] != 1) {
							if (chess[xx][yy] == 0) {
								count++;
								chess[xx][yy] = 2;
							}
								xx += pos_queen_x[j];
								yy += pos_queen_y[j];
						}
						else {
							break;
						}
					}
				}
			}
			for (int nn = 0; nn < number_night; nn++) {
				for (int nj = 0; nj < 8; nj++) {
					int xx = x_knight[nn] + pos_knight_x[nj];
					int yy = y_knigh[nn] + pos_knight_y[nj];
					while(xx >= 1 && xx < x && yy>= 1 && yy < y) {
						if (chess[xx][yy] != 1) {
							if (chess[xx][yy] == 0) {
						count ++;
						chess[xx][yy] = 2;}
						}
						else {
							break;
						}
					}
				}
			}
			count += (number_night + number_pawn + number_queen);
			System.out.println(x*y-count);
		}
	}

}

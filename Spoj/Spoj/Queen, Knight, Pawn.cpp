#include <cstdio>
#include <algorithm>
#include <cstring>

int chess[1001][1001];
// 8 nước quân mã có thể đi
int pos_knight_x[8]={-2,-1,-2,-1,1,2,2,1};
int pos_knight_y[8]={-1,-2,1,2,2,1,-1,-2};
// 8 hướng con hậu có thể ăn
int pos_queen_x[8]={-1,-1,-1,0,0,1,1,1};
int pos_queen_y[8]={0,1,-1,-1,1,-1,0,1};
using namespace std;
int main()
{
	int x_queen[100], y_queen[100], number_queen, x_knight[100], y_knight[100], number_knight,count, number_pawn, pawn_x, pawn_y;
	int x,y,i,j,k,number_test=1;
	freopen("data.txt","r",stdin);
	while(1)
	{
		count = 0;
		scanf("%d",&x);//row
		scanf("%d",&y);//col
		if(x==0&&y==0)break;
		memset(chess,0, sizeof(chess));
		scanf("%d", &number_queen);
		for(i=0; i<number_queen; i++){
			scanf("%d", &x_queen[i]);
			scanf("%d", &y_queen[i]);
			chess[x_queen[i]][y_queen[i]]=1;
		}
		scanf("%d", &number_knight);
		for(int i=0; i<number_knight; i++){
			scanf("%d", &x_knight[i]);
			scanf("%d", &y_knight[i]);
			chess[x_knight[i]][y_knight[i]]=1;
		}
		scanf("%d", &number_pawn);
		for(int i=0; i<number_pawn; i++){
			scanf("%d", &pawn_x);
			scanf("%d", &pawn_y);
			chess[pawn_x][pawn_y]=1;
		}
		// đánh dấu những ô con mã có thể ăn
		for(i=0; i<number_knight; i++)
		{
			for(j=0; j<8; j++){
				int xx = x_knight[i]+pos_knight_x[j];
				int yy = y_knight[i]+pos_knight_y[j];
				if(xx>=1&&xx<=x&&yy>=1&&yy<=y&&chess[xx][yy]==0){
					count++;chess[xx][yy]=2;
				}
			}
		}
		// duyệt tất cả các ô con hậu có thể ăn
		for(i=0; i<number_queen; i++)
		{
			for(j=0; j<8; j++){
				int xx = x_queen[i]+pos_queen_x[j];
				int yy = y_queen[i]+pos_queen_y[j];
				while(xx>=1&&xx<=x&&yy>=1&&yy<=y)
				{
					if(chess[xx][yy]!=1){
						if(chess[xx][yy]==0){count++;chess[xx][yy] = 2;}
						xx += pos_queen_x[j];
						yy += pos_queen_y[j];
					}
					else break;
				}
			}
		}
		count+= (number_knight+number_queen+number_pawn);
		printf("Board %d has %d safe squares.\n",number_test++, x*y-count);		
	}
		return 0;
}
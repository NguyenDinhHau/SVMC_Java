#include <iostream>
using namespace std;

char str[1000005];  // Luu xâu d?u vào
int  cnt[1000];     // M?ng d?m t?n su?t xu?t hi?n c?a kí t?

int main()
{
	freopen("input.txt","r",stdin);
	ios::sync_with_stdio(false);

	int m = -1, length = 0;
	char gar;
	while(true)
	{
		// Nh?p d?u vào và tính d? dài c?a xâu
		cin >> m;
		if (m == 0) break;
		gar = cin.get();

		length = 0;
		cin.getline(str, 1000005);
		while(str[length] != '\0') length++;
		
		for(int i=0; i<1000;i++)
			cnt[i] = 0;

		//////////////////////////
		int _max = 0;			// Ð? dài xâu con l?n nh?t th?a mãn
		int start = 0;			// ch? s? b?t d?u
		int id = 0;				// ch? s? hi?n t?i
		int numDiffChar = 0;	// s? kí t? khác nhau t? ch? s? b?t d?u d?n ch? s? hi?n t?i

		// Duy?t t? d?u d?n cu?i xâu
		while(id < length)
		{
			// Giá tr? m?ng d?m = 0 nghia là kí t? dó chua t?n t?i
			if(cnt[str[id]] == 0)
			{
				// N?u s? kí t? khác nhau nh? hon m thì ta s? cho kí t? dó vào xâu con
				// d?ng th?i tang giá tr? bi?n d?m s? l?n xu?t hi?n c?a kí t?, s? kí t? khác nhau
				// và ch? s? hi?n t?i
				if(numDiffChar < m)
				{
					cnt[str[id]] = 1;
					numDiffChar++;
					id++;
				}
				else if(numDiffChar == m)
				{
					// N?u s? kí t? khác nhau dã b?ng m r?i
					// thì ta không th? thêm kí t? m?i vào, khi dó s? kí t? khác nhau s? là m + 1
					// Do dó tôi ph?i d?ch ch? s? b?t d?u lên cho d?n khi s? kí t? khác nhau < m
					// Lúc dó m?i có th? thêm kí t? m?i.
					int t = id - start;
					if(t > _max) _max = t;

					while(numDiffChar == m)
					{
						cnt[str[start]]--;
						if(cnt[str[start]] == 0) numDiffChar--;
						start++;
					}
				}
			}
			else 
			{
				// Tru?ng h?p kí t? dó dã xu?t hi?n trong xâu con r?i
				// thì tôi ch? c?n bi?n d?m s? l?n xu?t hi?n c?a kí t? dó.
				cnt[str[id]]++;
				id++;
			}
		}

		int t = id - start;
		if(t > _max) _max = t;
		cout << _max << endl;
	}
	return 0;
}
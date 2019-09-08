#include <iostream>
using namespace std;

char str[1000005];  // Luu x�u d?u v�o
int  cnt[1000];     // M?ng d?m t?n su?t xu?t hi?n c?a k� t?

int main()
{
	freopen("input.txt","r",stdin);
	ios::sync_with_stdio(false);

	int m = -1, length = 0;
	char gar;
	while(true)
	{
		// Nh?p d?u v�o v� t�nh d? d�i c?a x�u
		cin >> m;
		if (m == 0) break;
		gar = cin.get();

		length = 0;
		cin.getline(str, 1000005);
		while(str[length] != '\0') length++;
		
		for(int i=0; i<1000;i++)
			cnt[i] = 0;

		//////////////////////////
		int _max = 0;			// �? d�i x�u con l?n nh?t th?a m�n
		int start = 0;			// ch? s? b?t d?u
		int id = 0;				// ch? s? hi?n t?i
		int numDiffChar = 0;	// s? k� t? kh�c nhau t? ch? s? b?t d?u d?n ch? s? hi?n t?i

		// Duy?t t? d?u d?n cu?i x�u
		while(id < length)
		{
			// Gi� tr? m?ng d?m = 0 nghia l� k� t? d� chua t?n t?i
			if(cnt[str[id]] == 0)
			{
				// N?u s? k� t? kh�c nhau nh? hon m th� ta s? cho k� t? d� v�o x�u con
				// d?ng th?i tang gi� tr? bi?n d?m s? l?n xu?t hi?n c?a k� t?, s? k� t? kh�c nhau
				// v� ch? s? hi?n t?i
				if(numDiffChar < m)
				{
					cnt[str[id]] = 1;
					numDiffChar++;
					id++;
				}
				else if(numDiffChar == m)
				{
					// N?u s? k� t? kh�c nhau d� b?ng m r?i
					// th� ta kh�ng th? th�m k� t? m?i v�o, khi d� s? k� t? kh�c nhau s? l� m + 1
					// Do d� t�i ph?i d?ch ch? s? b?t d?u l�n cho d?n khi s? k� t? kh�c nhau < m
					// L�c d� m?i c� th? th�m k� t? m?i.
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
				// Tru?ng h?p k� t? d� d� xu?t hi?n trong x�u con r?i
				// th� t�i ch? c?n bi?n d?m s? l?n xu?t hi?n c?a k� t? d�.
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
package mirrorstring;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//#include <stdio.h>
//#include <string.h>
//char text[3002];
//int index;
//int find_char(int pos, int len)
//{
//	int j=0;
//	for(j=index-1; j>pos; j--)
//		if(text[j]==text[pos])
//			{index=j;
//				return index;}
//	return -1;
//}
//int main()
//{
//	int number_test,i,j,len,max_sub, isSub, lenSub,count,temp,balance;
//	scanf("%d",&number_test);
//	while(number_test--)
//	{
//		scanf("%s",&text);
//		max_sub = 1;
//		len = strlen(text);
//		count = 0;
//		for(i=0; i<len; i++)
//		{
//			index = 0;
//			lenSub = 0;
//			index = len;
//			do{
//			if(find_char(i,len)==-1)break;
//			lenSub = index - i + 1;
//			if(lenSub<max_sub)break;
//			isSub = 1;temp = 0;balance = i+(index-i)/2;
//			for(j=i;j<=balance;j++)
//				{
//					if(text[j]!=text[index-temp++]){isSub = 0; break;}
//				}
//			if(isSub==1){count++; break;}
//			}
//			while(isSub==0);
//			if(lenSub>max_sub&&isSub==1){max_sub = lenSub;count=1;}
//
//		}
//		if(max_sub==1)count = len;
//		printf("%d %d\n",max_sub,count);
//	}
//	return 0;
//}
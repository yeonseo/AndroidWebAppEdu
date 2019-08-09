/**************************
Exercise11_02_03.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=9, arrYMax=9;						//배열 크기 정해주기
int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//배열정의
	

	for(i=0;i<arrXMax;i++)
	{
		for(j=0;j<arrYMax;j++)
		{
			arr[j][i] = j*i;
		}
	}
	printf("출력하고 싶은 구구단을 입력하세요 (ex : i j)");
	scanf("%d",&i);
	scanf("%d",&j);
	printf("%d",*(*(arr+i)+j));
	return 0;
}
//*/
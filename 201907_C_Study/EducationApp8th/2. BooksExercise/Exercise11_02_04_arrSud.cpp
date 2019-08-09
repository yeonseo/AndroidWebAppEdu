/**************************
Exercise11_02_02.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=3, arrYMax=4;						//배열 크기 정해주기
int numInputMulti(int *arr ,int i,int j, int numMin, int numMax);
int main()
{
	int arr1[arrYMax][arrXMax]={0,},arr2[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//배열정의
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				numInputMulti(&arr1[j][i],i,j,0, 10);
			}
		}

		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				numInputMulti(&arr2[j][i],i,j,0, 10);
			}
		}

		for(i=0;i<arrXMax;i++)
		{
			for(j=0;j<arrYMax;j++)
			{
				printf("%3d ", arr1[j][i]-arr2[j][i]);
			}
			printf("\n");
		}
		printf("\n");
	}
	return 0;
}
int numInputMulti(int *arr,int i,int j, int numMin, int numMax) //함수에서 받을 값을 *로 받는다
{
	do
	{
		printf("%d열 %d번째 수 : ",i,j);
		scanf("%d",arr);							//포인터로 받았기 때문에 주소
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]를 의미하는 것이고, 포인터를 의미하는 것.
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
//*/
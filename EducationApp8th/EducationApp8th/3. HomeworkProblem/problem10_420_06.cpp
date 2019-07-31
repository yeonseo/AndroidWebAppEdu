/**************************
Problem10_420_06.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=6, arrYMax=4;						//배열 크기 정해주기
int numInputMulti(int *arr ,int j,int i, int numMin, int numMax);
int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0,resultTotal=0, i=0, j=0, z=0, flag=0;	//배열정의
	
	while(1)
	{
		for(j=0 ; j<arrYMax-1; j++)
		{
			for(i=0; i<arrXMax-1 ; i++)
			{
				numInputMulti(&arr[j][i],j,i,0, 10);
				if(arr[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)	break;

		for(j=0 ; j<arrYMax-1; j++)
		{
			for(i=0; i<arrXMax-1 ; i++)
			{
				if(j<arrYMax-1)
				{
					printf("%5d",arr[j][i]);
					result=result+arr[j][i];
				}
			}
			printf("%5d",result);
			printf("\n");
			arr[arrYMax-1][j]=result;
			result=0;
		}

		for(i=0; i<arrXMax-1 ; i++)
		{
			for(j=0 ; j<arrYMax-1; j++)
			{
				if(j<arrYMax-1)
				{
					result=result+arr[j][i];
					resultTotal=resultTotal+arr[j][i];
				}
			}
			printf("%5d",result);
			result=0;
		}
		printf("%5d\n",resultTotal);
	}
	return 0;
}
int numInputMulti(int *arr,int j,int i, int numMin, int numMax) //함수에서 받을 값을 *로 받는다
{
	do
	{
		printf("%d열 %d행 가족은 몇명입니까 : ",j,i);
		scanf("%d",arr);							//포인터로 받았기 때문에 주소
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]를 의미하는 것이고, 포인터를 의미하는 것.
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
//*/
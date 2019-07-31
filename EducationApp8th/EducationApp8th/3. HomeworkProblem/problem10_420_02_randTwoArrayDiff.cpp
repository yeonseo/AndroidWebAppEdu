/**************************
Problem10_420_02.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#define ARRAY_LENGTH 10
int randNumbering();

int main()
{
	int i=0, j=0, resultMax=0,resultMin=0;
	int arr[ARRAY_LENGTH]={0,};	//배열정의
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다

	for(i=0;i<ARRAY_LENGTH;i++)
	{
		arr[i]=randNumbering();
	}

	resultMax=arr[0];
	resultMin=arr[0];
	for(i=0;i<ARRAY_LENGTH;i++)
	{
		for(j=0;j<ARRAY_LENGTH;j++)
		{
			resultMax=(resultMax>arr[j])?(resultMax):(arr[j]);
			resultMin=(resultMin>arr[j])?(arr[j]):(resultMin);
			printf("%d %d 최대%d 최소%d \n",arr[i],arr[j],resultMax,resultMin);
		}
	}
	printf("\n\n 결과 : 최대%d 최소%d \n",resultMax,resultMin);
	return 0;
}
int randNumbering()
{
	int result=0;
	result=rand()%100;
	return result;
}
//*/
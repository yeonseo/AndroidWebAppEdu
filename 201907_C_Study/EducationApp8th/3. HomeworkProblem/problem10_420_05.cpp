/**************************
Problem10_420_05.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>
#define ARRAY_LENGTH 100
#define RANDMAX 10
int randNumbering(int randMax);

int main()
{
	int i=0, j=0;
	int arr[ARRAY_LENGTH]={0,},arrCount[ARRAY_LENGTH]={0,};	//배열정의
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	
	for(i=0;i<ARRAY_LENGTH;i++)
	{
		arr[i]=randNumbering(RANDMAX);
		arrCount[i]=i;
	}

	for(i=0;i<RANDMAX;i++)
	{
		for(j=0;j<ARRAY_LENGTH;j++)
		{
			if(i==arr[j]) arrCount[i]++;
		}
		printf("%d의 갯수 : %d\n",i,arrCount[i]);
	}
	return 0;
}
int randNumbering(int randMax)
{
	int result=0;
	result=rand()%randMax;
	return result;
}
//*/

/* //우와아... 이렇게 또 겸손해집니다욧...ㅜㅜ 세상엔 날고 기는 사람들이 많다
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ARRAY_LENGTH 100
#define RANDMAX 9
#define RANDMIN 0

int main()
{
	int arr[ARRAY_LENGTH]={0,};	//배열정의
	int i=0,max=0,maxIndex=0,min=0,minIndex=0;

	const int SIZE = sizeof(arr)/sizeof(arr[0]);
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	
	for(i=0;i<ARRAY_LENGTH;i++) arr[rand()%(RANDMAX-RANDMIN+1)+RANDMIN]++;
	for(i=0;i<RANDMAX;i++) printf("%d의 갯수 : %d\n",i,arr[i]);

	max=arr[0],min=arr[0];
	for(i=0;i<RANDMAX;i++)
	{
		if(max < arr[i])
		{
			max = arr[i];
			maxIndex = i;
		}
		if(min > arr[i])
		{
			min = arr[i];
			minIndex = i;
		}
	}
	printf("최대값위치 = %d, 최대값 = %d\n", maxIndex, max);
	printf("최소값위치 = %d, 최소값 = %d\n", minIndex, min);
	return 0;
}
//*/
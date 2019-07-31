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
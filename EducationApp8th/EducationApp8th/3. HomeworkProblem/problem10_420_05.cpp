/**************************
Problem10_420_05.c
������
�Է�:����(void)
���:return��(0)
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
	int arr[ARRAY_LENGTH]={0,},arrCount[ARRAY_LENGTH]={0,};	//�迭����
	srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
	
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
		printf("%d�� ���� : %d\n",i,arrCount[i]);
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
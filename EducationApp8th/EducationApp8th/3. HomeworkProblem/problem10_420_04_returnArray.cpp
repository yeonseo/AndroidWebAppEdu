/**************************
Problem10_420_04.c
������
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>  
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define ARRAY_LENGTH 10
 
int numInputMulti(int *arr ,int i, int numMin, int numMax);
int randNumbering();
void array_equal(int *arr1,int *arr2,int size);
void return_array(int *arr1,int *arr2,int size);

int main()
{
	int i=0, j=0,flag=0;
	int arr1[ARRAY_LENGTH]={0,},arr2[ARRAY_LENGTH]={0,};	//�迭����

	while(1)
	{
		for(i=0 ; i<ARRAY_LENGTH; i++)			//������ �迭�� ����� �ޱ� ���
		{
			numInputMulti(&arr1[i],i,0, 100);
			if(arr1[0]==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)break;

		return_array(arr1,arr2,ARRAY_LENGTH);

		for(i=0 ; i<ARRAY_LENGTH ; i++)
		{
			printf("�迭�� : %d \n",*(arr2+i));
		}
	}

	return 0;
}

int numInputMulti(int *arr,int i, int numMin, int numMax) //�Լ����� ���� ���� *�� �޴´�
{
	do
	{
		printf("%d��° : ",i);
		scanf("%d",arr);							//�����ͷ� �޾ұ� ������ �ּ�
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]�� �ǹ��ϴ� ���̰�, �����͸� �ǹ��ϴ� ��.
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
int randNumbering()
{
	int result=0;
	result=rand()%100;
	return result;
}
void array_equal(int *arr1,int *arr2,int size)
{
	int i=0,result=0;
	for(i=0; i<size ; i++)
	{
		result=(*(arr1+i)==*(arr2+i))?(1):(0);
		printf("%d��° �迭 ��  %d : %d ��� : %d \n",i,*(arr1+i),*(arr2+i),result);
	}
}
void return_array(int *arr1,int *arr2,int size)
{
	int i=0,result=0;
	for(i=0; i<size ; i++)
	{
		*(arr2+i)=*(arr1+i);
	}
}
//*/
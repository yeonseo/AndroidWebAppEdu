/**************************
Exercise09-5.c
������
�������� 9-5
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInput(int a, int b);
int numInputMulti(int *arr, int a, int b);
int area(int a, int b);
void powers(int input);

int main()
{
	unsigned const int arrMax=1;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}

	powers(*multiNum[0]);
	return 0;
}
int numInput(int a, int b)		// ���ϰ� ������ ����
{
	int result;
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",result);
	return result;
}
int numInputMulti(int *arr,int a, int b) // ���ϰ� ������ �迭�� ����
{
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",arr);
	}while(*arr<a||*arr>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*arr);
	return 0;
}
int area(int a, int b)
{
	printf("\n\n******����******\n");
	return a*b;
}
void powers(int input)
{
	int j=0, a=0;
	printf("A TABLE OF POWERS\n");
	printf("----------------------------------------------------------\n");
	printf("  INTERGER      SQUARE        CUBE     QUARTIC     QUINTIC\n");
	printf("----------------------------------------------------------\n");
	
	for(j=0 ; j<3 ; j++)
	{
		a=input+j;
		printf("       %3d         %3d         %3d         %3d         %3d\n",a,a*a,a*a*a,a*a*a*a,a*a*a*a*a);
	}
	
}
//*/
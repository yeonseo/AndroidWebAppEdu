/**************************
Exercise09-4.c
������
�������� 9-4
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

void information();
int numInput(int a, int b);
int numInputMulti(int *arr, int a, int b);
int area(int a, int b);

int main()
{
	unsigned const int arrMax=2;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}

	information();
	result=area(*multiNum[0], *multiNum[1]);
	printf("��� : %d\n", result);
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
	return a*b;
}
void information()
{
	printf("\n\n******����******\n");
	return;
}
//*/
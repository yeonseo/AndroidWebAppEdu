/**************************
chap9_246.c
������
���� 9-7
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

void information();

int numInput(int a, int b);
int numInput2(int *num1, int *num2,int a, int b);
int numInputMulti(int *arr, int a, int b);

int sum(int a, int b);
int subtraction(int a, int b);

int main()
{
	////1. �ϳ��� ������ ����� �ޱ� ���
	//int num1=0,num2=0,result=0;
	//num1=numInput(1,100); 
	//num2=numInput(1,100);
	//information();
	//result=sum(num1,num2);
	//printf("%d, %d �Է� ��� : %d\n",num1,num2, result);
	//result=subtraction(num1,num2);
	//printf("%d, %d �Է� ��� : %d\n",num1,num2, result);

	////2. �����Ϳ� ����� �ޱ� ���
	//int *ptr1, *ptr2;
	//ptr1=&num1;
	//ptr2=&num2;
	//numInput2(ptr1, ptr2, 1, 100);
	//information();
	//result=sum(*ptr1, *ptr2);
	//printf("%d, %d �Է� ��� : %d\n",*ptr1,*ptr2, result);
	//result=subtraction(*ptr1, *ptr2);
	//printf("%d, %d �Է� ��� : %d\n",*ptr1,*ptr2, result);
		
	//3�� ��� ���� ����
	unsigned const int arrMax=4;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}
	information();

	result=sum(*multiNum[0], *multiNum[1]);
	printf("%d, %d �Է� ��� : %d\n",*multiNum[0],*multiNum[1], result);
	result=subtraction(*multiNum[2], *multiNum[3]);
	printf("%d, %d �Է� ��� : %d\n",*multiNum[2],*multiNum[3], result);	
	
	return 0;
}
int numInput(int a, int b)
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
int numInput2(int *ptr1, int *ptr2,int a, int b)
{
	do
	{
		printf("1. ���� �Է��Ͻÿ� : ");
		scanf("%d",ptr1);
	}while(*ptr1<a||*ptr1>b);
	
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*ptr1);
	do
	{
		printf("2. ���� �Է��Ͻÿ� : ");
		scanf("%d",ptr2);
	}while(*ptr2<a||*ptr2>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*ptr2);
	return 0;
}
int numInputMulti(int *arr,int a, int b)
{
	do
	{
		printf("%d ���� �Է��Ͻÿ� : ",i);
		scanf("%d",arr);
	}while(*arr<a||*arr>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*arr);
	return 0;
}
void information()
{
	printf("\n\n*******�������******\n");
	return;
}
int sum(int a, int b)
{
	int result;
	result=a+b;
	return result;
}
int subtraction(int a, int b)
{
	int result;
	result=a-b;
	return result;
}
//*/
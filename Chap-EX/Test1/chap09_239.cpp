/**************************
chap9_239.c
������
���� 9-3
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
void information();
int numInput(int a, int b);
int sum(int a, int b);
int subtract(int a, int b);
double multiplication(double a, double b);
double divide(double a, double b);

int main()
{
	int num1=0,num2=0,result=0;
	double res=0;
	num1=numInput(1,100); 
	num2=numInput(1,100);

	information();

	result=sum(num1,num2);
	printf("****************\n* ������� %d\n",result);

	result=subtract(num1,num2);
	printf("****************\n* ������� %d\n",result);

	res=multiplication(num1,num2);
	printf("****************\n* ������� %lf\n",res);

	res=divide(num1,num2);
	printf("****************\n* ��������� %lf\n",res);

	return 0;
}
int sum(int a, int b)
{
	int result;
	result=a+b;
	return result;
}
int subtract(int a, int b)
{
	int result;
	result=a-b;
	return result;
}
double multiplication(double a, double b)
{
	double result;
	result=a*b;
	return result;
}
double divide(double a, double b)
{
	double result;
	result=a/b;
	return result;
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
void information()
{
	printf("\n\n*******�������******\n");
	return;
}
//*/
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
double numInput(double a, double b);
double divide(double a, double b);

int main()
{
	double num1=0,num2=0,res=0;
	num1=numInput(0,100); 
	num2=numInput(0,100);

	information();

	res=divide(num1,num2);
	printf("��������� %lf\n",res);

	return 0;
}

double divide(double a, double b)
{
	double result;
	result=a/b;
	return result;
}
double numInput(double a, double b)
{
	double result;
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%lf",&result);
	}while(result<a||result>b);
	printf("���� %lf�� �ԷµǾ����ϴ�.\n",result);
	return result;
}
void information()
{
	printf("\n\n******�������******\n");
	return;
}
//*/
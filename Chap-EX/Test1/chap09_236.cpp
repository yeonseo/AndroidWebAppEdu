/**************************
chap9_236.c
������
���� 9-2
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int numInput(int a, int b);
int max(int a, int b);
int min(int a, int b);

int main()
{
	int num1=0,num2=0,result=0;
	num1=numInput(1,100); 
	num2=numInput(1,100);

	result=max(num1,num2);
	printf("%d�� %d �߿��� ū ���� %d�Դϴ�.\n",num1,num2,result);
	result=min(num1,num2);
	printf("%d�� %d �߿��� ���� ���� %d�Դϴ�.\n",num1,num2,result);
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
int max(int a, int b)
{
	if(a>b) return a;
	else	return b;
}
int min(int a, int b)
{
	if(a<b) return a;
	else	return b;
}//*/
/**************************
Exercise09-1.c
������
�������� 9-1
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
void information();
int numInput(int a, int b);
int absolut(int a);
int main()
{
	int num=0,result=0;
	double res=0;
	num=numInput(-100,100); 
	information();
	result=absolut(num);
	printf("%d �Է� ��� : %d\n",num, result);
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
int absolut(int a)
{
	int i=0, result=0;
	if(a>0)
		return a;
	else
		return -a;
}
void information()
{
	printf("\n\n******���� ��ȯ******\n");
	return;
}
//*/
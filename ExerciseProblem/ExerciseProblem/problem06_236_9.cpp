/**************************
Problem6-236_9.c
������
�������� 6-236_9��
�Է�:����(void)
���:return��(0)
**************************/
/* 
#include <stdio.h>
int numInput(int a, int b);
int calculator(int a);
int main()
{
	int input1=0,flag=0,result=0;
	do
	{
		input1=numInput(-100, 100);
		if(input1==0)
		{
			flag=1;
			break;
		}
		result=calculator(input1);
		printf("f(x)���� %d�Դϴ�.\n",result);
		if(flag==1) break;
	}while(input1!=0);
	return 0;
}
int numInput(int a, int b)
{
	int result;
	printf("������ �Է� (���� : 0) : ");
	do
	{
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",result);
	return result;
}
int calculator(int a)
{
	int result;
	if(a>0)
		return 7*a+2;
	else
		return a*a*a-9*a+2;
}
//*/
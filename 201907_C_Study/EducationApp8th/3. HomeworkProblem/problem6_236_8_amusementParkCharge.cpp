/**************************
Problem6-236_8.c
������
�������� 6-236_8��
�Է�:����(void)
���:return��(0)
**************************/
/* 
#include <stdio.h>
int numInput(int a, int b);
void charge(int a, int b);
int main()
{
	int input1=0,input2=0,flag=0;
	do
	{
		printf("����ð��� ���̸� �Է� (���� : 0) : ");
		input1=numInput(0, 24);
		input2=numInput(0, 100);
		if(input1==0||input2==0)
		{
			flag=1;
			break;
		}
		charge(input1, input2);
		if(flag==1) break;
	}while(input1!=0||input2!=0);
	return 0;
}
int numInput(int a, int b)
{
	int result;
	do
	{
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",result);
	return result;
}
void charge(int a, int b)
{
	if(a<17)
	{
		if(b<=3||b<=12||b>=65) printf("��� : 25,000\n");
		else printf("��� : 34,000\n");
	}
	else
		printf("��� : 10,000\n");
}
//*/
/**************************
Problem6-236_7.c
������
�������� 6-236_7��
�Է�:����(void)
���:return��(0)
**************************/
/* 
#include <stdio.h>
int numInput(int a, int b);
void possble(int a, int b);
int main()
{
	int input1=0,input2=0,i=0;
	do
	{
		printf("ü�߰� Ű�� �Է� (���� : 0) : ");
		input1=numInput(0, 200);
		input2=numInput(0, 200);
		if(input1==0||input2==0) break;
		possble(input1, input2);
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
void possble(int a, int b)
{
	int result;
	if(a>(b-100)*0.9)
		printf("%d : ��ü�� \n",a);
	else
		printf("%d : ����ü�� \n",a);
}
//*/
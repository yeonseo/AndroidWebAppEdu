/**************************
chap9_240.c
������
���� 9-4
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
void information();
int numInput(int a, int b);
int thirdTimeSum(int a);

int main()
{
	int num=0,result=0;
	double res=0;
	num=numInput(1,100); 

	information();

	result=thirdTimeSum(num);
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
int thirdTimeSum(int a)
{
	int i=0, result=0;
	for(i=0 ; i<=a ; i++)
	{
		result=result+i;
	}
	return result;
}

void information()
{
	printf("\n\n*******�������******\n");
	return;
}
//*/
/**************************
Problem6-235_3.c
������
�������� 6-235_3��
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>

int	main(void)
{
	int num1=0, num2=0, num3=0, result=0;
	do
	{
		do
		{
			printf("����1�� �Է��Ͻÿ� :");
			scanf("%d",&num1);
			printf("����2�� �Է��Ͻÿ� :");
			scanf("%d",&num2);
			printf("����3�� �Է��Ͻÿ� :");
			scanf("%d",&num3);
		}while(num1<0||num1>100||num2<0||num2>100||num3<0||num3>100);
		
		if(num1==0||num2==0||num3==0) break;
		else if(num1>num2)
			result=(num2>num3)?(num3):(num2);
		else if(num2>num1)
			result=(num1>num3)?(num3):(num1);
		printf("���� ���� %d�Դϴ�. \n", result);
	}while(num1!=0||num2!=0||num3!=0);
	return 0;
}//*/
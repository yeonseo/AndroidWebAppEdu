/**************************
Exercise08-2.c
������
�������� 8-2
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>

int	main(void)
{
	int num1=0, result=0;
	
	do
	{
		printf("������ �Է��Ͻÿ� :");
		scanf("%d",&num1);
	}while(num1<0||num1>1000);
	//printf("%d",num1);
	
	while(num1!=0)
	{
		result=num1%10;
		num1=num1/10;
		if(result%2==0)
			printf("%d : ¦��  ",result);
		else if(result%2==1)
			printf("%d : Ȧ��  ",result);
	}
	printf("\n");
	return 0;
}//*/
/**************************
Problem7-287_8.c
������
�������� 7-287_8��
�Է�:����(void)
���:return��(0)
**************************/
//for
/*
#include <stdio.h>
int main()
{
	int input=0, i=0,flag=0;

	while(input!=-1)
	{
		do
		{
			printf("������� (���� : -1) : ");
			scanf("%d",&input);
			if(input==-1)
			{
				flag=1;
				break;
			}
		}while(input<0||input>100);

		if(flag==1) break;
		for(i=1;i<=input;i++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}
//*/
/**************************
Problem7-288_13.c
������
�������� 7-288_13��
�Է�:����(void)
���:return��(0)
**************************/
//for
/*
#include <stdio.h>
int main()
{
	int input=0,flag=0;
	while(input!=-1)
	{
		do
		{
			printf("\n���� ������ �����ϼ���(����:-1) : ");
			scanf("%d",&input);;
			if(input==-1)
			{
				flag = 1;
				break;
			}
		}while(input<0||input>9999);

		if(flag==1) break;

		while(input!=0)
		{
			printf("%d",input%10);
			input=input/10;
		}
	}
	return 0;
}
//*/
/**************************
Problem7-285_1.c
������
�������� 7-285_1��
�Է�:����(void)
���:return��(0)
**************************/
//dp-while ��
/*
#include <stdio.h>
int main()
{
	int sum=0, i=0;

	do
	{
		i++;
		if(i%3==0)
		{
			sum=sum+i;
			//printf("%d, sum�� = %d\n",i,sum);
		}
	}while(i<=100);

	printf("1���� 100������ ��� 3�� ����� ���� %d�Դϴ�.\n", sum);
	return 0;
}
//*/
//while ��
/*
#include <stdio.h>
int main()
{
	int sum=0, i=0;

	while(i<=100)
	{
		i++;
		if(i%3==0)
		{
			sum=sum+i;
			//printf("%d, sum�� = %d\n",i,sum);
		}
	}

	printf("1���� 100������ ��� 3�� ����� ���� %d�Դϴ�.\n", sum);
	return 0;
}
//*/

//for��
/*
#include <stdio.h>
int main()
{
	int sum=0, i=0;

	for(i=1;i<=100;i++)
	{
		if(i%3==0)
		{
			sum=sum+i;
			//printf("%d, sum�� = %d\n",i,sum);
		}
	}

	printf("1���� 100������ ��� 3�� ����� ���� %d�Դϴ�.\n", sum);
	return 0;
}
//*/
/**************************
7-6.c
������
for ���� �⺻
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int numInt, numFin, cho;
	int num0=0;

	printf("�ʱⰪ�� �Է��ϼ��� : ");
	scanf("%d",&numInt);
	
	printf("���ǰ��� �Է��ϼ��� : ");
	scanf("%d",&numFin);

	printf("����� �񱳿����ڸ� �����ϼ���.\n1.< 2.<= 3. >= 4.>\n���ڸ� �Է��ϼ��� :");
	scanf("%d",&cho);

	switch (cho)
	{
		case 1:
			for(numInt;numInt<numFin;numInt++) 
			{
				printf("�ݺ����� : %d ",numInt);
				num0++;
				printf("�ݺ�Ƚ�� : %d \n",num0);
			}
			break;

		case 2:
			for(numInt;numInt<=numFin;numInt++) 
			{
				printf("�ݺ����� : %d ",numInt);
				num0++;
				printf("�ݺ�Ƚ�� : %d \n",num0);
			}
			break;

		case 3:
			for(numInt;numInt>=numFin;numInt++) 
			{
				printf("�ݺ����� : %d ",numInt);
				num0++;
				printf("�ݺ�Ƚ�� : %d \n",num0);
			}
			break;

		case 4:
			for(numInt;numInt>numFin;numInt++) 
			{
				printf("�ݺ����� : %d ",numInt);
				num0++;
				printf("�ݺ�Ƚ�� : %d \n",num0);
			}
			break;

		default:
			printf("1,2,3,4 �߿� �Է��ϼ���.\n");
	printf("�ݺ��� ���� �� ���� num : %d\n",numInt);
	}
	return 0;
}
*/
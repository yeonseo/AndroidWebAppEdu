/**************************
Exercise07-7.c
������
�������� 7-7
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int grade[10]={};
	int next=0, i=0;
	double totalGrade=0;

	for(i=0;i<10;i++)
	{
		printf("**********%d�� ����**********\n",i+1);
		do
		{
			printf("%d�� ������ ������ �Է��� �ּ��� : ",i+1);
			scanf("%d",&grade[i]);

			printf("�Է��� ���� %d �½��ϱ�?\n������ 0, Ʋ���� 1 �Է�",grade[i]);
			scanf("%d",&next);
		}while(next>0);
		totalGrade=grade[i];
	}

	printf("�� ���� ������ ����� %lf�Դϴ�.\n",totalGrade);
	return 0;
}//*/
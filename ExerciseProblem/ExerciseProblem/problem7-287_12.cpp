/**************************
Problem7-287_12.c
������
�������� 7-287_12��
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int	main(void)
{
	int inputNum=0, fNum1=0, fNum2=0, fNum3=1, i=1;

	printf("�� ��° �Ǻ���ġ �������� ����Ͻðڽ��ϱ�? : ");
	scanf("%d",&inputNum);

	for(i=0;i<=inputNum;i++)
	{
		if(i%2==0)									//¦����°���� fNum2�� ����
		{
			fNum2=fNum3;
			//printf("1-2) %d\n",fNum2);
			//printf("%d)\n",i);
		}else										//¦����°���� fNum1�� ����
		{
			fNum1=fNum3;
			//printf("1-1) %d\n",fNum1);
			//printf("%d)\n",i);
		}

		fNum3=fNum2+fNum1;
		printf("%d\n",fNum3);
		//printf("%d)\n",i);

	}
	printf("���� ��� %��° �Ǻ���ġ ���� %d�Դϴ�.\n",inputNum,fNum3);
	return 0;
}//*/
/**************************
Exercise06-5.c
������
�������� 6-5
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
struct type							//����ü ���� ����
	{
		char cNum;
		char cNum1;
		char cNum2;
		char cResult;

		int iNum;
		int iNum1;
		int iNum2;
		int iResult;

		float fNum;
		float fNum1;
		float fNum2;
		float fResult;

		double dNum;
		double dNum1;
		double dNum2;
		double dResult;
	};

int	main(void)
{
	struct type t;					//�������� ����ü �ҷ�����
	t.iNum1=0,t.iNum2=0;

	printf("�ΰ��� ���ڸ� �Է��Ͻÿ�\n");
	scanf("%d",&t.iNum1);
	scanf("%d",&t.iNum2);

	for(;t.iNum1*t.iNum2<=0 || t.iNum1>100 ||t.iNum2>100;)
	{
		printf("�ΰ��� ���ڸ� 1���� 100���� �Է��Ͻÿ�\n");
		scanf("%d",&t.iNum1);
		scanf("%d",&t.iNum2);
	}
	
	printf("%d/%d = %lf �Դϴ�.:\n",t.iNum1,t.iNum2,(double)t.iNum1/t.iNum2);	//. ���  ??����??
	return 0;
}//*/
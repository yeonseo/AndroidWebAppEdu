/**************************
Exercise06-4.c
������
�������� 6-4
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
	t.iNum=0;

	printf("ASCII �ڵ带 �Է��ϼ��� :");
	scanf("%d",&t.iNum);
	for(;t.iNum<65 || t.iNum>90;)
	{
		printf("65���� 90���̷� �ڵ带 �Է��Ͻÿ� :");
		scanf("%d",&t.iNum);
		while(getchar()!='\n');
	}
	
	printf("�Է��� ASCII�ڵ�� %d�̰�, ���ڴ� %c �Դϴ�.:\n",t.iNum,t.iNum);	//. ���  ??����??
	return 0;
}//*/
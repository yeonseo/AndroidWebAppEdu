/**************************
Exercise06-3.c
������
�������� 6-3
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
	long double printValue;
	t.iNum=0,t.fNum=0,t.dNum=0;

	t.iNum = (long)('a'+1.3);	//1.3�� �Ǽ��κп��� ������ �սǹ߻�
	printValue = ('a'+1.3);
	printf("����ȯ : %d, long double �� : %lf\n",t.iNum,printValue);

	t.fNum = 2.49+t.iNum;		//
	printValue = 2.49 + printValue;
	printf("����ȯ : %f, long double �� : %lf\n",t.fNum,printValue);

	t.dNum=(double)t.fNum*t.iNum;
	printValue = printValue*('a'+1.3);
	printf("����ȯ : %lf, long double �� : %lf\n",t.dNum,printValue);

	printf("long double�� ������ %d",sizeof(printValue));
	
	return 0;
}//*/
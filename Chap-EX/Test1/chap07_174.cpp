/**************************
chap7_173.c
������
���� 7-1
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

	t.iNum=0,t.iResult=0 ;						//����ü �ּҰ��� �����Է�

	while(t.iNum<=10)
	{
		t.iResult=t.iResult+t.iNum;
		printf("t.iNum = %d, result = %d\n",t.iNum,t.iResult);
		t.iNum++;
	}
	printf("************�ݺ��� ����************\n");
	return 0;
}//*/
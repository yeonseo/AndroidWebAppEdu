/**************************
Problem7-285_6.c
������
�������� 7-285_6��
�Է�:����(void)
���:return��(0)
**************************/
//����
/*
#include <stdio.h>
int main()
{
	int num1=0, num2=0, result=0;
	char input=0;
	do
	{
		while(input!='A'&&input!='S'&&input!='M'&&input!='D'&&input!='Q') //���� ����� �ޱ�
		{
			printf("********************\nA ---- Add\nS ---- Subtract\nM ---- Multiply\nD ---- Divide\nQ ---- Quit\n********************\n");
			printf("������ �����ϼ��� : ");
			scanf("%c",&input);
			while( getchar() != '\n' );						//���ۿ� ���� ������ ���ֱ�
			if(input>96) input=input-32;					//�ҹ��ڷ� �Է��� �� �빮�ڷ� ��ȯ
			//printf("%c\n",input);							//�빮�ڷ� �ٲ� �� Ȯ���ϱ�
		}
		if(input=='Q') break;
			
		do
		{
			printf("1�� 100������ �� ���� �������� �и��Ͽ� �Է��ϼ��� : ");
			scanf("%d %d",&num1,&num2);
			while( getchar() != '\n' );						//���ۿ� ���� ������ ���ֱ�
		}while((num1<1||num1>100)||(num2<1||num2>100));		//1���� 100���� ���ڸ� �ޱ�

		if(input=='A') result=num1+num2;
		if(input=='S') result=num1-num2;
		if(input=='M') result=num1*num2;
		if(input=='D') result=num1/num2;
		printf("�������� %d�Դϴ�.\n",result);
		input=0;											//���� �ʱ�ȭ�ϱ�
	}while(input!='Q');
	return 0;
}
//*/
/**************************
Problem7-285_6.c
������
�������� 7-285_6��
�Է�:����(void)
���:return��(0)
**************************/
//����

///*
#include <stdio.h>
#include <math.h>
#define PI 3.14
double add(double a, double b)
{
	double result;
	result=a+b;
	//printf("%lf",result);
	return result;
}
double sub(double a, double b)
{
	double result;
	result=a-b;
	//printf("%lf",result);
	return result;
}
double mul(double a, double b)
{
	double result;
	result=a*b;
	//printf("%lf",result);
	return result;
}
double div(double a, double b)
{
	double result;
	if(b==0){
		printf("0�� ������ �����ϴ�.\n");
		result=a;
		printf("������� �� ���갪 %lf�� �����մϴ�.",result);
	}else{
		result=a/b;
		//printf("%lf",result);
	}
	return result;
}
double rad(double a)
{
	double result;
	result=a*PI/180.0;;
	//printf("%lf",result);
	return result;
}
double root(double a)
{
	double result;
	result=sqrtl((long double)a);
	return result;
}
void info()
{
	printf("********************\n");
	printf("*******YS-NAM*******\n");
	printf("A ---- ���ϱ�\n");
	printf("S ---- ����\n");
	printf("M ---- ���ϱ�\n");
	printf("D ---- ������\n");
	printf("\n");
	printf("R ---- ȣ����\n");
	printf("J ---- ������\n");
	printf("\n");
	printf("C ---- �ʱ�ȭ\n");
	printf("E ---- ���������\n");
	printf("Q ---- ������\n");
	printf("********************\n");
}
int main()
{
	double num1=0, num2=0, result=0;
	char menu=0;
	int flag=0,menuNum=0;
	
	info();
	printf("���ڸ� �Է��ϼ��� : ");						//ù ���� �ޱ�
	scanf("%lf",&num1);
	while( getchar() != '\n' );	

	do
	{
		while(menu!='A'&&menu!='S'&&menu!='M'&&menu!='D'&&menu!='R'&&menu!='J'&&menu!='C'&&menu!='E'&&menu!='Q') //���� ����� �ޱ�
		{
			if(flag==1)
			{
				info();
				flag=0;
			}
			printf("������ �����ϼ��� (���� �޴� ���� : I �Է�) : ");
			scanf("%c",&menu);
			while( getchar() != '\n' );					//scanf char���� ��!!!! ���ۿ� ���� ������ ���ֱ�
			if(menu>96) menu=menu-32;					//�ҹ��ڷ� �Է��� �� �빮�ڷ� ��ȯ
			if(menu=='I') flag=1;
			//printf("%c",menu);						//�빮�ڷ� �ٲ� �� Ȯ���ϱ�
		}
		if(menu=='Q') 
		{
			break;
		}
		if(menu=='E') 
		{
			printf("�������� %lf�Դϴ�.\n",result);
		}
		if(menu=='C') result=0;
		
		if(menu=='R') result=rad(result);
		if(menu=='J') result=root(result);
		result=0;

		printf("���ڸ� �Է��ϼ��� : ");
		scanf("%lf",&num1);
		while( getchar() != '\n' );	

		if(menu=='A') result=add(result,num1);
		if(menu=='S') result=sub(result,num1);
		if(menu=='M') result=mul(result,num1);
		if(menu=='D') result=div(result,num1);

		menu=0;											//���� �ʱ�ȭ�ϱ�
		menuNum=0;											//���� �ʱ�ȭ�ϱ�
	}while(menu!='Q');
	return 0;
}
//*/

///* // ������
#include <stdio.h>
#include <math.h>
#define PI 3.14
double add(double a, double b)
{
	double result;
	result=a+b;
	//printf("%lf",result);
	return result;
}
double sub(double a, double b)
{
	double result;
	result=a-b;
	//printf("%lf",result);
	return result;
}
double mul(double a, double b)
{
	double result;
	result=a*b;
	//printf("%lf",result);
	return result;
}
double div(double a, double b)
{
	double result;
	if(b==0){
		printf("0�� ������ �����ϴ�.\n");
		result=a;
		printf("������� �� ���갪 %lf�� �����մϴ�.",result);
	}else{
		result=a/b;
		//printf("%lf",result);
	}
	return result;
}
void info()
{
	printf("********************\n");
	printf("A ---- ���ϱ�\n");
	printf("S ---- ����\n");
	printf("M ---- ���ϱ�\n");
	printf("D ---- ������\n");
	printf("\n");
	printf("C ---- �ʱ�ȭ\n");
	printf("E ---- ���������\n");
	printf("Q ---- ������\n");
	printf("********************\n");
}
int main()
{
	double num1=0, num2=0, result=0;
	char menu=0;
	int flag=0;
	
	info();

	printf("���ڸ� �Է��ϼ��� : ");
	scanf("%lf",&result);
	while( getchar() != '\n' );	

	do
	{
		while(menu!='A'&&menu!='S'&&menu!='M'&&menu!='D'&&menu!='C'&&menu!='E'&&menu!='Q') //���� ����� �ޱ�
		{
			if(flag==1)
			{
				info();
				flag=0;
			}
			printf("������ �����ϼ��� (���� �޴� ���� : I �Է�) : ");
			scanf("%c",&menu);
			//printf("%c",menu);
			while( getchar() != '\n' );					//scanf char���� ��!!!! ���ۿ� ���� ������ ���ֱ�
			if(menu>96) menu=menu-32;					//�ҹ��ڷ� �Է��� �� �빮�ڷ� ��ȯ
			if(menu=='I') flag=1;
			//printf("%c",menu);						//�빮�ڷ� �ٲ� �� Ȯ���ϱ�
		}
		if(menu=='Q') 
		{
			break;
		}
		if(menu=='E') 
		{
			printf("�������� %lf�Դϴ�.\n",result);
		}
		if(menu=='C') result=0;
			
		//do
		//{
		//	printf("1�� 100������ �� ���� �������� �и��Ͽ� �Է��ϼ��� : ");
		//	scanf("%d %d",&num1,&num2);
		//	while( getchar() != '\n' );						//���ۿ� ���� ������ ���ֱ�
		//}while((num1<1||num1>100)||(num2<1||num2>100));		//1���� 100���� ���ڸ� �ޱ�
		printf("���ڸ� �Է��ϼ��� : ");
		scanf("%lf",&num1);
		while( getchar() != '\n' );	

		if(menu=='A') result=add(result,num1);
		if(menu=='S') result=sub(result,num1);
		if(menu=='M') result=mul(result,num1);
		if(menu=='D') result=div(result,num1);
		
		//printf("�������� %lf�Դϴ�.\n",result);
		menu=0;											//���� �ʱ�ȭ�ϱ�
	}while(menu!='Q');
	return 0;
}
//*/

/*
#include <stdio.h>
int main()
{
	double num1=0, num2=0, result=0;
	char menu=0;
	do
	{
		while(menu!='A'&&menu!='S'&&menu!='M'&&menu!='D'&&menu!='Q') //���� ����� �ޱ�
		{
			printf("********************\n");
			printf("A ---- Add\n");
			printf("S ---- Subtract\n");
			printf("M ---- Multiply\n");
			printf("D ---- Divide\n");
			printf("Q ---- Quit\n");
			printf("********************\n");
			printf("������ �����ϼ��� : ");
			scanf("%c",&menu);
			while( getchar() != '\n' );						//scanf char���� ��!!!! ���ۿ� ���� ������ ���ֱ�
			
			if(menu>96) menu=menu-32;					//�ҹ��ڷ� �Է��� �� �빮�ڷ� ��ȯ
			//printf("%c\n",input);							//�빮�ڷ� �ٲ� �� Ȯ���ϱ�
		}
		if(menu=='Q') break;
			
		do
		{
			printf("1�� 100������ �� ���� �������� �и��Ͽ� �Է��ϼ��� : ");
			scanf("%d %d",&num1,&num2);
			while( getchar() != '\n' );						//���ۿ� ���� ������ ���ֱ�
		}while((num1<1||num1>100)||(num2<1||num2>100));		//1���� 100���� ���ڸ� �ޱ�

		if(menu=='A') result=num1+num2;
		if(menu=='S') result=num1-num2;
		if(menu=='M') result=num1*num2;
		if(menu=='D') result=num1/num2;
		printf("�������� %d�Դϴ�.\n",result);
		menu=0;												//���� �ʱ�ȭ�ϱ�
	}while(menu!='Q');
	return 0;
}
//*/

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
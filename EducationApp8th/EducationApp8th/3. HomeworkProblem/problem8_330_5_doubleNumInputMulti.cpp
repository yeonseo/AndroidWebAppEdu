/**************************
Problem8-330_5.c
������
�������� 8-330_5��
�Է�:����(void)
���:return��(0)
**************************/
/* ///double numInputMulti
#include <stdio.h>
#include <string.h>
#include <math.h>

int numInputMulti(double *pointArr, int numMin, int numMax);
void sin_degree(double degree);

#define PI 3.14

int main()
{
	unsigned const int arrMax=1;		//�迭 ũ�� �����ֱ�
	int i=0, flag=0;
	double arr[arrMax], result=0,*multiNum[arrMax];	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],0, 10000);
			if(*multiNum[0]==0)
			{
				flag=1;
				break;
			}
			sin_degree(*multiNum[i]);
		}
		if(flag==1)	break;
	}
	return 0;
}
int numInputMulti(double *pointArr, int numMin, int numMax) // ���ϰ� ������ �迭�� ����
{
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%lf",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("���� %lf�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
void sin_degree(double degree)
{
	double mathResult=sin(degree*PI/180);
	printf("�Է��Ͻ� %lf degree�� sin ���� : (PI:3.14) %lf, (math.h���) %lf \n",degree,(PI*degree)/180.0,mathResult);
}//*/
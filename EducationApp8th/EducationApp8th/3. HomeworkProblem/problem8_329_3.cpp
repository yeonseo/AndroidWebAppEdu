/**************************
Problem8-329_3.c
������
�������� 8-329_3��
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>
#define PI 3.14

int numInputMulti(int *pointArr, int numMin, int numMax);
void area(int radian);

int main()
{
	unsigned const int arrMax=1;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0, counting=0, flag=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-100, 100);
			if(*multiNum[0]==0)
			{
				flag=1;
				break;
			}
			area(*multiNum[i]);
		}
		if(flag==1)	break;
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // ���ϰ� ������ �迭�� ����
{
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
void area(int radian)
{
	printf("�������� %d�� ��, ������ %.2lf �Դϴ�. \n",radian,radian*radian*PI);
}
//*/
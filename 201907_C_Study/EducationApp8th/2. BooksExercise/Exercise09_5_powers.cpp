/**************************
Exercise09-5.c
������
�������� 9-5
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInput(int numMin, int numMax);
int numInputMulti(int *pointArr, int numMin, int numMax);
void powersOutput(int num);
int square(int num);
int cube(int num);
int quartic(int num);
int quintic(int num);

int main()
{
	unsigned const int arrMax=1;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}
	powersOutput(*multiNum[0]);
	return 0;
}
int numInput(int numMin, int numMax)		// ���ϰ� ������ ����
{
	int result;
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",&result);
	}while(result<numMin||result>numMin);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",result);
	return result;
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
void powersOutput(int num)
{
	int j=0, a=0;
	printf("A TABLE OF POWERS\n");
	printf("----------------------------------------------------------\n");
	printf("  INTERGER      SQUARE        CUBE     QUARTIC     QUINTIC\n");
	printf("----------------------------------------------------------\n");
	
	for(j=0 ; j<3 ; j++)
	{
		a=num+j;
		printf("     %5d       %5d       %5d       %5d       %5d\n",a,square(a),cube(a),quartic(a),quintic(a));
	}
}
int square(int num)
{
	return num*num;
}
int cube(int num)
{
	return num*num*num;
}
int quartic(int num)
{
	return num*num*num*num;
}
int quintic(int num)
{
	return num*num*num*num*num;
}
//*/
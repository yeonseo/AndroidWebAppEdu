/**************************
Exercise09-6.c
������
�������� 9-6
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInput(int numMin, int numMax);
int numInputMulti(int *pointArr, int numMin, int numMax);
void sumAndCount(int a, int b);
void powers(int input);

int main()
{
	unsigned const int arrMax=2;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0, counting=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],0, 100);
		}

		if(*multiNum[0]==0||*multiNum[1]==0)
		{
			printf("�� ���� Ƚ�� : %d\n",counting);
			break;
		}
		sumAndCount(*multiNum[0],*multiNum[1]);
		counting++;
	}
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
void sumAndCount(int a, int b)
{
	printf("********��********\n");
	printf("��� : %d\n\n",a+b);
}
//*/
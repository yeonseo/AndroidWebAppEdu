/**************************
Problem8-329_2.c
������
�������� 8-329_2��
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void fTempture(int input);

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
				//printf("�� ���� Ƚ�� : %d\n",counting);
				flag=1;
				break;
			}
			
			fTempture(*multiNum[i]);
		}
		if(flag==1)	break;
		//counting++;							//����Ƚ�� ī����
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // ���ϰ� ������ �迭�� ����
{
	do
	{
		printf("ȭ������ �Է��Ͻÿ�.");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
void fTempture(int input)
{
	printf("���� ���� %lf�� �Դϴ�.\n", (5.0/9.0)*(input-32.0));
}//*/
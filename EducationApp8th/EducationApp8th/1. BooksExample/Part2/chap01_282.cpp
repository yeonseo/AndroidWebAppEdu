/**************************
chap1_282.c
������
���� 1-2
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrMax=5;		//�迭 ũ�� �����ֱ�
	int *multiNum[3][arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[3][arrMax], result=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(j=0; j<3 ; j++)
		{
			for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
			{
				multiNum[j][i]=&arr[j][i];
				numInputMulti(multiNum[j][i],0, 10000);
				if(*multiNum[0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(j=0;j<3;j++)
		{
			for(i=0;i<arrMax;i++)
			{
				printf("%d ",arr[j][i]);
			}
			printf("\n");
		}
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
//*/
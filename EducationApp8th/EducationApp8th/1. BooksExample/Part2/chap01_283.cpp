/**************************
chap1_283.c
������
���� 1-3
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=1, arrYMax=3;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrXMax][arrYMax], arr[arrXMax][arrYMax]={0,};	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int result=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)			//������ �迭�� ����� �ޱ� ���
			{
				multiNum[i][j]=&arr[i][j];
				numInputMulti(multiNum[i][j],0, 10000);
				if(*multiNum[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(i=0;i<arrXMax;i++)
		{
			for(j=0;j<arrYMax;j++)
			{
				result = result + arr[i][j];
				printf("%dȸ�� ��� : %d \n",j,result);
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
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
//*/
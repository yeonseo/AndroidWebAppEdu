/**************************
Exercise01-03.c
������
�������� 01-03
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=5, arrYMax=3;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int rowSum[3]={0,} , columnSum[3]={0,};
	int result=0,arrSum=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(j=0 ; j<arrYMax; j++)
		{
			for(i=0; i<arrXMax ; i++)			//������ �迭�� ����� �ޱ� ���
			{
				multiNum[j][i]=&arr[j][i];
				numInputMulti(multiNum[j][i],0, 10000);
				if(*multiNum[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(j=0 ; j<arrYMax; j++)						//�Էµ� ���� row�� �κ� ����ϱ�
		{
			for(i=0; i<arrXMax ; i++)
			{
				arrSum = arrSum + arr[j][i];
				result = result + arr[j][i];
				printf("[%d][%d] : %2d   ",j,i,arr[j][i]);
			}
			printf("[%d][X] : %2d   \n",j,arrSum);
			arrSum=0;									//���� ������ arrSum �ʱ�ȭ
		}
		
		for(i=0; i<arrXMax ; i++)						//col�� �κи� ����ϱ� ���ؼ� ���ϱ� �ݺ�
		{
			for(j=0 ; j<arrYMax; j++)					//i�� j�� �������Ѽ� �� ���� ��µǵ��� ��
			{
				arrSum = arrSum + arr[j][i];
				//printf("[%d][%d] : %d   ",j,i,arr[j][i]);	 //�Է°��� �ּ�ó����
			}
			printf("[X][%d] : %2d   ",i,arrSum);
			arrSum=0;									//���� ������ arrSum �ʱ�ȭ
		}
		printf("�� ������� : %2d   \n",result);
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // ���ϰ� ������ �迭�� ����
{
	do
	{
		//printf("���� �Է��Ͻÿ� : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;

}
//*/

/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=5, arrYMax=3;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int result=0,arrSum=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(j=0 ; j<arrYMax; j++)
		{
			for(i=0; i<arrXMax ; i++)			//������ �迭�� ����� �ޱ� ���
			{
				multiNum[j][i]=&arr[j][i];
				numInputMulti(multiNum[j][i],0, 10000);
				if(*multiNum[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(j=0 ; j<arrYMax; j++)						//�Էµ� ���� row�� �κ� ����ϱ�
		{
			for(i=0; i<arrXMax ; i++)
			{
				arrSum = arrSum + arr[j][i];
				result = result + arr[j][i];
				printf("[%d][%d] : %2d   ",j,i,arr[j][i]);
			}
			printf("[%d][X] : %2d   \n",j,arrSum);
			arrSum=0;									//���� ������ arrSum �ʱ�ȭ
		}
		
		for(i=0; i<arrXMax ; i++)						//col�� �κи� ����ϱ� ���ؼ� ���ϱ� �ݺ�
		{
			for(j=0 ; j<arrYMax; j++)					//i�� j�� �������Ѽ� �� ���� ��µǵ��� ��
			{
				arrSum = arrSum + arr[j][i];
				//printf("[%d][%d] : %d   ",j,i,arr[j][i]);	 //�Է°��� �ּ�ó����
			}
			printf("[X][%d] : %2d   ",i,arrSum);
			arrSum=0;									//���� ������ arrSum �ʱ�ȭ
		}
		printf("�� ������� : %2d   \n",result);
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // ���ϰ� ������ �迭�� ����
{
	do
	{
		//printf("���� �Է��Ͻÿ� : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
//*/
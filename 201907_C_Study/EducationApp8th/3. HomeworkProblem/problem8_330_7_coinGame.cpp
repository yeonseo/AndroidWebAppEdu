/**************************
Problem8-330_7.c
������
�������� 8-330_7��
�Է�:����(void)
���:return��(0)
**************************/
/* //coinGame
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int numInputMulti(int *pointArr, int numMin, int numMax);
int coinRand(int randMIn, int randMax);
void coinGame(int compCoin, int userCoin);

int main()
{
	unsigned const int arrMax=1;					//�迭 ũ�� �����ֱ�
	int i=0, flag=0;
	int arr[arrMax], *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-1, 1);
			if(*multiNum[0]==-1)
			{
				flag=1;
				break;
			}
			coinGame(coinRand(0, 1),*multiNum[i]);
		}
		if(flag==1)	break;
	}

	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // ���ϰ� ������ �迭�� ����
{
	do
	{
		printf("���� �Է��Ͻÿ� : (���� : -1)");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
int coinRand(int randMIn, int randMax)		//������ ������ �Է¹޴´�
{
	srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
	return rand()%(randMax-randMIn+1)+randMIn;
}
void coinGame(int compCoin, int userCoin)
{
	if(compCoin==userCoin) printf("�¾ҽ��ϴ�. \n\n");
	else printf("���������� Ʋ�Ƚ��ϴ�. \n\n");
}
//*/
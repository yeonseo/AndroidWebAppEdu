/**************************
Exercise01-04.c
������
�������� 01-04
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=9, arrYMax=1;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int result=0, i=0, j=0, z=0, flag=0;
	
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
					
		for(j=0 ; j<arrYMax; j++)
		{
			 z=0;
			for(i=0; i<arrXMax ; i++)
			{
				for(z=2 ; z<=9 ; z++)
				{
					printf("%2d * %2d : %2d  ",arr[j][i],z,arr[j][i]*z);
				}
				printf("\n");
			}
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
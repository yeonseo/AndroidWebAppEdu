/**************************
Problem8-331_10.c
������
�������� 8-331_10��
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void isMutiple(int num1,int num2);

int main()
{
	unsigned const int arrMax=2;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrMax];				//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int arr[arrMax], result=0, i=0, flag=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//������ �迭�� ����� �ޱ� ���
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-1, 100);
			if(arr[0]==-1||arr[1]==-1)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)	break;
		isMutiple(*multiNum[0],*multiNum[1]);
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
void isMutiple(int num1,int num2)
{
	if(num1%num2==0)
	{
		printf("���� %d(��)�� %d�� ����Դϴ�. \n\n",num1, num2);
	}else
	{
		printf("���� %d(��)�� %d�� ����� �ƴմϴ�. \n\n",num1, num2);
	}
}//*/
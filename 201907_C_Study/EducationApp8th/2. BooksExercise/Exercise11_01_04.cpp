/**************************
Exercise11-04.c
������
�������� 11-04
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *arr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=1, arrYMax=1;		//�迭 ũ�� �����ֱ�
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, z=0, flag=0;	//�迭����
	int timeTables[9]={1,2,3,4,5,6,7,8,9};
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				//1���� �迭���� �Է°��� �ޱ� ���ؼ� �ּҰ����� �ش�.
				//1�������� �����ؼ� ��ȯ���� �ް� �����ϱ�!!!
				numInputMulti(&arr[j][i],0, 10000);
				if(arr[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==1)	break;
					

		for(i=0 ; i<9 ; i++)
		{
			printf("%2d * %2d : %2d \n",arr[0][0],timeTables[i],arr[0][0]*timeTables[i]);
		}
		printf("\n");

	}
	return 0;
}
int numInputMulti(int *arr, int numMin, int numMax) //�Լ����� ���� ���� *�� �޴´�
{
	do
	{
		printf("���� �Է��Ͻÿ� : ");
		scanf("%d",arr);							//�����ͷ� �޾ұ� ������ �ּ�
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]�� �ǹ��ϴ� ���̰�, �����͸� �ǹ��ϴ� ��.
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
//*/
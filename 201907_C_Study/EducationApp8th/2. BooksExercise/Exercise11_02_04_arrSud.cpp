/**************************
Exercise11_02_02.c
������
�Է�:����(void)
���:return��(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=3, arrYMax=4;						//�迭 ũ�� �����ֱ�
int numInputMulti(int *arr ,int i,int j, int numMin, int numMax);
int main()
{
	int arr1[arrYMax][arrXMax]={0,},arr2[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//�迭����
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				numInputMulti(&arr1[j][i],i,j,0, 10);
			}
		}

		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				numInputMulti(&arr2[j][i],i,j,0, 10);
			}
		}

		for(i=0;i<arrXMax;i++)
		{
			for(j=0;j<arrYMax;j++)
			{
				printf("%3d ", arr1[j][i]-arr2[j][i]);
			}
			printf("\n");
		}
		printf("\n");
	}
	return 0;
}
int numInputMulti(int *arr,int i,int j, int numMin, int numMax) //�Լ����� ���� ���� *�� �޴´�
{
	do
	{
		printf("%d�� %d��° �� : ",i,j);
		scanf("%d",arr);							//�����ͷ� �޾ұ� ������ �ּ�
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]�� �ǹ��ϴ� ���̰�, �����͸� �ǹ��ϴ� ��.
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
//*/
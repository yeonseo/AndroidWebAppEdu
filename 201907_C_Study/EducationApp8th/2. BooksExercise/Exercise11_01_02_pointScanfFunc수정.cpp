/**************************
Exercise01-02.c
������
�������� 01-02
�Է�:����(void)
���:return��(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=1, arrYMax=3;						//�迭 ũ�� �����ֱ�
int numInputMulti(int *arr , int numMin, int numMax);
int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//�迭����
	
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

		for(i=0;i<arrXMax;i++)
		{
			for(j=0;j<arrYMax;j++)
			{
				result = result + arr[j][i];
				printf("%dȸ�� ��� : %d \n",j,result);
			}
			printf("��� : ��� %d, ���� %d \n",result/arrYMax,result);
			printf("\n");
		}
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

/*
#include <stdio.h>
int add(int *a)
{
	int i=0;
	for(i=0; i<5 ; i++)
	{
		printf("add : a[%d] = %d \n",i,a[i]);
	}
	return 0;
}
int main()
{
	int a[4]={10,20,30,40};
	int i=0;
	for(i=0; i<5 ; i++)
	{
		printf("main : a[%d] = %d \n",i,a[i]);
	}
	add(a);
	return 0;
}
//*/

/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=1, arrYMax=10;		//�迭 ũ�� �����ֱ�
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int result=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)			//������ �迭�� ����� �ޱ� ���
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
					
		for(i=0;i<arrXMax;i++)
		{
			for(j=0;j<arrYMax;j++)
			{
				result = result + arr[j][i];
				printf("%dȸ�� ��� : %d \n",j,result);
			}
			printf("��� : ��� %d, ���� %d \n",result/arrYMax,result);
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
/**************************
Exercise11_02_02.c
������
�Է�:����(void)
���:return��(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=3, arrYMax=3;						//�迭 ũ�� �����ֱ�
int numInputMulti(int *arr ,int i,int j, int numMin, int numMax);

int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//�迭����
	
	while(1)
	{
		for(i=0; i<arrXMax ; i++)
		{
			for(j=0 ; j<arrYMax; j++)
			{
				numInputMulti(&arr[i][j],i,j,0, 10);
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
				result = result + arr[i][j];
				//printf("%d�� %dȣ ���� ������ : %d\n",i+1,j+1,result);
			}
		}
		printf("�� �ֹμ� %d \n",result);
		printf("\n");
	}
	return 0;
}
int numInputMulti(int *arr,int i,int j, int numMin, int numMax) //�Լ����� ���� ���� *�� �޴´�
{
	do
	{
		printf("%d�� %dȣ ������ ����Դϱ� : ",i+1,j+1);
		scanf("%d",arr);							//�����ͷ� �޾ұ� ������ �ּ�
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]�� �ǹ��ϴ� ���̰�, �����͸� �ǹ��ϴ� ��.
	//printf("���� %d�� �ԷµǾ����ϴ�.\n",*pointArr);
	return 0;
}
//*/
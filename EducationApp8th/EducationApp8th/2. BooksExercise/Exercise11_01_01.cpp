/**************************
Exercise11_01-01.c
������
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int main()
{
	unsigned const int arrXMax=1, arrYMax=6;		//�迭 ũ�� �����ֱ�
	char *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax];	//���� ���� �ޱ� ���ؼ� �����͹迭 ����ϱ�
	int result=0, i=0, j=0,z=0, flag=0;
	
	while(1)
	{
		for(j=0 ; j<3 ; j++)
		{
			printf("���� �Է��Ͻÿ� : ");
			scanf("%c",&arr[j][0]);
			while(getchar()!='\n');
		}
		for(j=0 ; j<arrYMax ; j++)
		{
			printf("arr[%d] : %c \n",j,arr[j][0]);
		}
		
		z=3;
		for(j=0;j<arrYMax;j++)
		{
			if(j<3) printf("arr[%d] : %c \n",j,arr[j][0]);
			else
			{
				z--;
				arr[j][i]=arr[z][i];
				printf("arr[%d] : %c \n",j,arr[j][0]);
			}
		}
	}
	return 0;
}
//*/
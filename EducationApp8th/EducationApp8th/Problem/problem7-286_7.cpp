/**************************
Problem7-285_7.c
������
�������� 7-285_7��
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int	main(void)
{
	int divideNum=0, primeNum=0, count=0;

	for(primeNum=2;primeNum<=100;primeNum++)							//1���� 100���� �� ����
	{
		count=0;
		//printf("gogo *********%d***********\n",primeNum);				//primeNumȮ�� �۾�
		for(divideNum=2;divideNum<=primeNum;divideNum++)				//���� �� ����
		{
			//printf("%d",divideNum);									//divideNumȮ�� �۾�
			//printf(" %d ",primeNum);									//primeNumȮ�� �۾�
			if(primeNum%divideNum==0) count++;
			//printf("%d\n",count);										//countȮ�� �۾�
		}

		if(count==1) printf("%d ",primeNum);
	}
	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
	int  i=0,j=0,count=0,num=0;

	do
	{
		printf("2-100 ������ ���ڸ� �Է��ϼ��� : ");
		scanf("%d",&num);
	}while(num<2||num>100);

	for (i=2; i<=num ; i++)
	{
		count=0;
		for(j=1 ; j<=i  ; j++)
		{
			if(i%j==0)
			{
				count++;
			}	
		}
		if(count==2)
		{
			 printf("%d ",i);
		}
		
	}
	return 0;
}
//*/
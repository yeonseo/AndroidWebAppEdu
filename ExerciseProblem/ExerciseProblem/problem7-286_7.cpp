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
/**************************
Problem8-330_6.c
������
�������� 8-330_6��
�Է�:����(void)
���:return��(0)
**************************/
/* //rand
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void binaryRand(int randMIn, int randMax);

int main()
{
	int i=0, flag=0;
	binaryRand(0, 1);	
	return 0;
}
void binaryRand(int randMIn, int randMax)		//������ ������ �Է¹޴´�
{
	int i=0;
	srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
	for(i=0 ; i<5 ;i++)
		{
			printf("%d ",rand()%(randMax-randMIn+1)+randMIn);
		}
	printf("\n");
}
//*/
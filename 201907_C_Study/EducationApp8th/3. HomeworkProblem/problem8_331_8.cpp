/**************************
Problem8-331_8.c
������
�������� 8-331_8��
�Է�:����(void)
���:return��(0)
**************************/
/* //rand
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void floatRand();

int main()
{
	int i=0, flag=0;
	floatRand();	
	return 0;
}
void floatRand()		//������ ������ �Է¹޴´�
{
	int i=0;
	srand((unsigned)time(NULL));				//���� �߻����� �������� �ʱ�ȭ�Ѵ�
	for(i=0 ; i<5 ;i++)
		{
			printf("%lf  ",rand()/(float)RAND_MAX); //RAND_MAX������ ������ 0�� 1���� �� ��ȯ
		}
	printf("\n");
}
//*/
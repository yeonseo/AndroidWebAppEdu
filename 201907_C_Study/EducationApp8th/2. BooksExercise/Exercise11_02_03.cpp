/**************************
Exercise11_02_03.c
������
�Է�:����(void)
���:return��(0)
**************************/
/* //point!!
#include <stdio.h>
#include <string.h>
unsigned const int arrXMax=9, arrYMax=9;						//�迭 ũ�� �����ֱ�
int main()
{
	int arr[arrYMax][arrXMax]={0,},result=0, i=0, j=0, flag=0;	//�迭����
	

	for(i=0;i<arrXMax;i++)
	{
		for(j=0;j<arrYMax;j++)
		{
			arr[j][i] = j*i;
		}
	}
	printf("����ϰ� ���� �������� �Է��ϼ��� (ex : i j)");
	scanf("%d",&i);
	scanf("%d",&j);
	printf("%d",*(*(arr+i)+j));
	return 0;
}
//*/
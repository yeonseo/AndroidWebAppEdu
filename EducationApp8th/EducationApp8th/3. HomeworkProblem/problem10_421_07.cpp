/**************************
Problem10_421_07.c
������
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

#define ARRAY_LENGTH 10

void numInputMulti(int *arr, int numMin, int numMax);

int main()
{
	int i=0,input=0;
	int arr1[ARRAY_LENGTH]={0,},arr2[ARRAY_LENGTH]={0,},arr3[ARRAY_LENGTH]={0,};

	for(i=0;i<ARRAY_LENGTH;i++)
	{
		arr1[i]=i;
		arr2[i]=i*i;
		arr3[i]=i*i*i;
	}

	numInputMulti(&input, 0 , 100);

	for(i=0 ; i<ARRAY_LENGTH ; i++)
	{
		if(input == arr3[i]) printf("%d�� ���������� %d\n",input,i);
	}
	
	
	
	return 0;
}
void numInputMulti(int *arr, int numMin, int numMax) //�Լ����� ���� ���� *�� �޴´�
{
	do
	{
		printf("�������� ������ �Է��Ͻÿ�: ");
		scanf("%d",arr);							//�����ͷ� �޾ұ� ������ �ּ�
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]�� �ǹ��ϴ� ���̰�, �����͸� �ǹ��ϴ� ��.
}

//*/
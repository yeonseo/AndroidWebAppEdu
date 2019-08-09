/**************************
Problem10_421_07.c
남연서
입력:없음(void)
출력:return값(0)
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
		if(input == arr3[i]) printf("%d의 세제곱근은 %d\n",input,i);
	}
	
	
	
	return 0;
}
void numInputMulti(int *arr, int numMin, int numMax) //함수에서 받을 값을 *로 받는다
{
	do
	{
		printf("세제곱의 정수를 입력하시오: ");
		scanf("%d",arr);							//포인터로 받았기 때문에 주소
	}while(*arr<numMin||*arr>numMax);				//*arr=arr[]를 의미하는 것이고, 포인터를 의미하는 것.
}

//*/
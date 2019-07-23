/**************************
chap9_246.c
남연서
예제 9-7
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

void information();

int numInput(int a, int b);
int numInput2(int *num1, int *num2,int a, int b);
int numInputMulti(int *arr, int a, int b);

int sum(int a, int b);
int subtraction(int a, int b);

int main()
{
	////1. 하나의 변수에 결과값 받기 사용
	//int num1=0,num2=0,result=0;
	//num1=numInput(1,100); 
	//num2=numInput(1,100);
	//information();
	//result=sum(num1,num2);
	//printf("%d, %d 입력 결과 : %d\n",num1,num2, result);
	//result=subtraction(num1,num2);
	//printf("%d, %d 입력 결과 : %d\n",num1,num2, result);

	////2. 포인터에 결과값 받기 사용
	//int *ptr1, *ptr2;
	//ptr1=&num1;
	//ptr2=&num2;
	//numInput2(ptr1, ptr2, 1, 100);
	//information();
	//result=sum(*ptr1, *ptr2);
	//printf("%d, %d 입력 결과 : %d\n",*ptr1,*ptr2, result);
	//result=subtraction(*ptr1, *ptr2);
	//printf("%d, %d 입력 결과 : %d\n",*ptr1,*ptr2, result);
		
	//3번 경우 변수 선언
	unsigned const int arrMax=4;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}
	information();

	result=sum(*multiNum[0], *multiNum[1]);
	printf("%d, %d 입력 결과 : %d\n",*multiNum[0],*multiNum[1], result);
	result=subtraction(*multiNum[2], *multiNum[3]);
	printf("%d, %d 입력 결과 : %d\n",*multiNum[2],*multiNum[3], result);	
	
	return 0;
}
int numInput(int a, int b)
{
	int result;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
int numInput2(int *ptr1, int *ptr2,int a, int b)
{
	do
	{
		printf("1. 수를 입력하시오 : ");
		scanf("%d",ptr1);
	}while(*ptr1<a||*ptr1>b);
	
	printf("값이 %d로 입력되었습니다.\n",*ptr1);
	do
	{
		printf("2. 수를 입력하시오 : ");
		scanf("%d",ptr2);
	}while(*ptr2<a||*ptr2>b);
	printf("값이 %d로 입력되었습니다.\n",*ptr2);
	return 0;
}
int numInputMulti(int *arr,int a, int b)
{
	do
	{
		printf("%d 수를 입력하시오 : ",i);
		scanf("%d",arr);
	}while(*arr<a||*arr>b);
	printf("값이 %d로 입력되었습니다.\n",*arr);
	return 0;
}
void information()
{
	printf("\n\n*******연산시작******\n");
	return;
}
int sum(int a, int b)
{
	int result;
	result=a+b;
	return result;
}
int subtraction(int a, int b)
{
	int result;
	result=a-b;
	return result;
}
//*/
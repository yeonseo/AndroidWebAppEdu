/**************************
Exercise09-4.c
남연서
연습문제 9-4
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

void information();
int numInput(int a, int b);
int numInputMulti(int *arr, int a, int b);
int area(int a, int b);

int main()
{
	unsigned const int arrMax=2;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}

	information();
	result=area(*multiNum[0], *multiNum[1]);
	printf("결과 : %d\n", result);
	return 0;
}
int numInput(int a, int b)		// 리턴값 변수에 저장
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
int numInputMulti(int *arr,int a, int b) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",arr);
	}while(*arr<a||*arr>b);
	printf("값이 %d로 입력되었습니다.\n",*arr);
	return 0;
}
int area(int a, int b)
{
	return a*b;
}
void information()
{
	printf("\n\n******넓이******\n");
	return;
}
//*/
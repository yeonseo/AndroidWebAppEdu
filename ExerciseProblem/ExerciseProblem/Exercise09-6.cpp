/**************************
Exercise09-6.c
남연서
연습문제 9-6
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInput(int a, int b);
int numInputMulti(int *arr, int a, int b);
void sumAndCount(int a, int b);
void powers(int input);

int main()
{
	unsigned const int arrMax=2;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0, counting=0;

	

	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],0, 100);
		}

		if(*multiNum[0]==0||*multiNum[1]==0)
		{
			printf("총 연산 횟수 : %d\n",counting);
			break;
		}
		sumAndCount(*multiNum[0],*multiNum[1]);
		counting++;
		
	}
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
void sumAndCount(int a, int b)
{
	printf("\n******합******\n");
	printf("결과 : %d\n\n",a+b);
}
//*/
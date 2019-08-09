/**************************
Problem8-329_2.c
남연서
연습문제 8-329_2번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void fTempture(int input);

int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0, counting=0, flag=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-100, 100);
			if(*multiNum[0]==0)
			{
				//printf("총 연산 횟수 : %d\n",counting);
				flag=1;
				break;
			}
			
			fTempture(*multiNum[i]);
		}
		if(flag==1)	break;
		//counting++;							//연산횟수 카운팅
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("화씨값을 입력하시오.");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
void fTempture(int input)
{
	printf("섭씨 값은 %lf도 입니다.\n", (5.0/9.0)*(input-32.0));
}//*/
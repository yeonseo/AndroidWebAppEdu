/**************************
Problem8-331_9.c
남연서
연습문제 8-331_9번
입력:없음(void)
출력:return값(0)
**************************/
/* //drowStick
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void drowStick(int incom);

int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0, flag=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-100, 100);
			if(*multiNum[0]<0)
			{
				flag=1;
				break;
			}
			drowStick(*multiNum[i]);
		}
		if(flag==1)	break;
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : (종료 : 음수) ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
void drowStick(int incom)
{
	int i=0;
	for(i=0;i<incom;i++)
	{
		printf("*");
	}
	printf("\n\n");
}//*/
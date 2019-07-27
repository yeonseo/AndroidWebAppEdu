/**************************
Problem8-330_7.c
남연서
연습문제 8-330_7번
입력:없음(void)
출력:return값(0)
**************************/
/* //coinGame
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int numInputMulti(int *pointArr, int numMin, int numMax);
int coinRand(int randMIn, int randMax);
void coinGame(int compCoin, int userCoin);

int main()
{
	unsigned const int arrMax=1;					//배열 크기 정해주기
	int i=0, flag=0;
	int arr[arrMax], *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-1, 1);
			if(*multiNum[0]==-1)
			{
				flag=1;
				break;
			}
			coinGame(coinRand(0, 1),*multiNum[i]);
		}
		if(flag==1)	break;
	}

	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : (종료 : -1)");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
int coinRand(int randMIn, int randMax)		//난수의 범위를 입력받는다
{
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	return rand()%(randMax-randMIn+1)+randMIn;
}
void coinGame(int compCoin, int userCoin)
{
	if(compCoin==userCoin) printf("맞았습니다. \n\n");
	else printf("ㅍㅋㅋㅋㅋ 틀렸습니다. \n\n");
}
//*/
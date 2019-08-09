/**************************
Problem8-330_6.c
남연서
연습문제 8-330_6번
입력:없음(void)
출력:return값(0)
**************************/
/* //rand
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void binaryRand(int randMIn, int randMax);

int main()
{
	int i=0, flag=0;
	binaryRand(0, 1);	
	return 0;
}
void binaryRand(int randMIn, int randMax)		//난수의 범위를 입력받는다
{
	int i=0;
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	for(i=0 ; i<5 ;i++)
		{
			printf("%d ",rand()%(randMax-randMIn+1)+randMIn);
		}
	printf("\n");
}
//*/
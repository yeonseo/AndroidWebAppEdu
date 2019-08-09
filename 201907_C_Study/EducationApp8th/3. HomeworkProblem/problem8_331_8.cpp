/**************************
Problem8-331_8.c
남연서
연습문제 8-331_8번
입력:없음(void)
출력:return값(0)
**************************/
/* //rand
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void floatRand();

int main()
{
	int i=0, flag=0;
	floatRand();	
	return 0;
}
void floatRand()		//난수의 범위를 입력받는다
{
	int i=0;
	srand((unsigned)time(NULL));				//난수 발생기의 시작점을 초기화한다
	for(i=0 ; i<5 ;i++)
		{
			printf("%lf  ",rand()/(float)RAND_MAX); //RAND_MAX값으로 나누어 0과 1사이 값 반환
		}
	printf("\n");
}
//*/
/**************************
Test0711-if삼항.c
남연서
로직문제if 삼항 3num 비교하기
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <time.h>

int main()
{
	time_t currentTimeInfo=0;			//time_t형으로 변수선언을 한다
	struct tm* t;						//구조체 tm을 가져온다

	currentTimeInfo=time(NULL);			//time_t변수에 현재까지 흐른 초를 받기(1900년0월0일 시작임을 기억하자)
	t = localtime(&currentTimeInfo);	//

	printf("현재 시간은 %d : %d : %d 입니다.\n",t->tm_hour,t->tm_min,t->tm_sec);

	return 0;
}//*/

/*
#include <stdio.h>
#include <time.h>

int main()
{
	time_t currentTime;
	struct tm* t;
	currentTime = time(NULL);
	t = localtime(&currentTime);

	printf("현재시간은 %d : %d : %d 입니다.\n",t->tm_hour,t->tm_min,t->tm_sec);
	return 0;
}//*/
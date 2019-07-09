/**************************
Exercise05-8.c
남연서
연습문제 5-8
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <time.h>
#include <windows.h>
int main()
{
	time_t timer,intialTime;
	struct tm *inT, *nowT;

	printf("시작! 측정까지 기다려주세요.\n");
	intialTime = time(NULL);

	Sleep(1000);
	timer=time(NULL);

	printf("흘러간 시간 : %ds\n",timer-intialTime);
	return 0;
}
*/

/*
#include <stdio.h>
#include <time.h>
#include <windows.h>
int main()
{
	time_t intialTime=0, inputTime=0;
	time(&intialTime);



	printf("흘러간 시간 : %ds\n",timer-intialTime);
	return 0;
}
*/
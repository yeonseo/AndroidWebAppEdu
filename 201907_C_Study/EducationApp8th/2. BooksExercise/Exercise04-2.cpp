/**************************
Exercise04-2.c
남연서
연습문제 4-2
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <time.h>

#define BIRTH_YEAR 1990
#define BRO_BIRTH_YEAR 1992

int main()
{
	time_t timer;
	struct tm *t;

	int thisYear=0;
	timer = time(NULL); // 현재 시각을 초 단위로 얻기
	t = localtime(&timer); // 초 단위의 시간을 분리하여 구조체에 넣기
	thisYear=t->tm_year + 1900;

	printf("올해는 %d입니다.\n내 나이는 %d살입니다.\n",thisYear,thisYear-BIRTH_YEAR);
	printf("나는 %d년에 태어나 %d번째 해가 되었습니다.\n", BIRTH_YEAR,thisYear-BIRTH_YEAR);
	printf("내 동생의 나이는 %d살입니다.\n",thisYear-BRO_BIRTH_YEAR);
	printf("내 동생은 %d년에 태어나 %d번째 해가 되었습니다.\n",BRO_BIRTH_YEAR,thisYear-BRO_BIRTH_YEAR);
	return 0;
}
*/
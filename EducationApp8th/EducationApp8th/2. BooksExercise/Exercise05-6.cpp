/**************************
Exercise05-6.c
남연서
연습문제 5-6
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#define FULL_LIFE 100
#define MIN_PER_LIFE 11
#define SMOKED_YEAR 20

int main()
{
	int cigerDay=0;
	float shortenLife=0.0f, remainingLife=0.0f;
	printf("당신은 하루에 몇 개피를 피우시나요? : ");
	scanf("%d",&cigerDay);
	shortenLife=(SMOKED_YEAR*365*cigerDay*MIN_PER_LIFE)/(float)(365*24*60);
	remainingLife=FULL_LIFE-SMOKED_YEAR-shortenLife;
	printf("20년 동안 %d개피를 피울 때, 단축된 수명은 %f이고 남은 수명은 %f입니다.\n",cigerDay,shortenLife,remainingLife);
	return 0;
}
*/
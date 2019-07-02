/**************************
Exercise02-4.c
남연서
연습문제 2-4
입력:없음(void)
출력:return값(0)
**************************/
/**/
#include <stdio.h>
int main()
{
	int r;
	double pi=3.14;

	printf("반지름 길이를 입력하세요 : ");
	scanf("%d",&r);

	printf("원의 넓이는 %lf 입니다.\n",r*pi);

	return 0;
}

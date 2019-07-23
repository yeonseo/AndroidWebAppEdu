/**************************
Exercise06-7.c
남연서
연습문제 6-7
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#define PI 3.14
int	main(void)
{
	double radian=0,circleLength=0.0, circleArea=0.0;

	printf("반지름를 입력하세요 :");
	scanf("%lf",&radian);

	for(;radian<10 || radian>15;)
	{
		printf("\n10부터 15까지 입력하시오\n");
		printf("반지름를 입력하세요 :");
		scanf("%lf",&radian);
	}
	circleArea=radian*radian*PI;
	circleLength = radian*2*PI;
	
	printf("\n입력하신 반지름에 대한 원의 둘레는 %.2lf, 원의 면적은 %.2lf 입니다.\n",circleArea,circleLength);
	return 0;
}//*/
/**************************
Exercise06-6.c
남연서
연습문제 6-6
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#define PI 3.14
int	main(void)
{
	int radian=0, velopCar=0;
	double trackLength=0.0;

	printf("반지름를 입력하세요 :");
	scanf("%d",&radian);
	printf("자동차의 속력을 입력하세요 :");
	scanf("%d",&velopCar);

	for(;radian*velopCar<=0 || velopCar>300 || radian>300;)
	{
		printf("1부터 300까지 입력하시오\n");
		printf("반지름를 입력하세요 :");
		scanf("%d",&radian);
		printf("자동차의 속력을 입력하세요 :");
		scanf("%d",&velopCar);
	}

	trackLength = radian*2*PI;

	printf("%.3lf km의 트랙을 도는데 걸리는 시간은 %.3lfhour입니다.\n",trackLength,trackLength/velopCar);
	return 0;
}//*/
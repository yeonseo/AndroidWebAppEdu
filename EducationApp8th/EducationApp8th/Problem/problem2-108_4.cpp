/**************************
Problem2-108_4.c
남연서
연습문제 2-108 4번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	double dTemC, dTemF;
	int iTemChoice;
	int iTrun=0;

	for (iTrun;iTrun<2;iTrun)
	{
		printf("변환하고 싶은 온도를 선택하세요. 1.화씨>섭씨 2,화씨>섭씨 ");
		scanf("%d",&iTemChoice);

		switch (iTemChoice)
		{
		case 1:
			printf("화씨값을 입력하시오.");
			scanf("%lf",&dTemF);
			dTemC = (5.0/9.0)*(dTemF-32.0);
			printf("섭씨 값은 %lf도 입니다.\n", dTemC);
			break;

		case 2:
			printf("Sorry!! I don't Know :)\n");
			iTrun=2;
			break;
		}
	}
	return 0;
}
*/
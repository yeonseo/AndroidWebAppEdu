/**************************
Exercise06-5.c
남연서
연습문제 6-5
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
struct type							//구조체 구조 선언
	{
		char cNum;
		char cNum1;
		char cNum2;
		char cResult;

		int iNum;
		int iNum1;
		int iNum2;
		int iResult;

		float fNum;
		float fNum1;
		float fNum2;
		float fResult;

		double dNum;
		double dNum1;
		double dNum2;
		double dResult;
	};

int	main(void)
{
	struct type t;					//변수선언 구조체 불러오기
	t.iNum1=0,t.iNum2=0;

	printf("두개의 숫자를 입력하시오\n");
	scanf("%d",&t.iNum1);
	scanf("%d",&t.iNum2);

	for(;t.iNum1*t.iNum2<=0 || t.iNum1>100 ||t.iNum2>100;)
	{
		printf("두개의 숫자를 1부터 100까지 입력하시오\n");
		scanf("%d",&t.iNum1);
		scanf("%d",&t.iNum2);
	}
	
	printf("%d/%d = %lf 입니다.:\n",t.iNum1,t.iNum2,(double)t.iNum1/t.iNum2);	//. 사용  ??왜지??
	return 0;
}//*/
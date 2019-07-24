/**************************
Exercise06-3.c
남연서
연습문제 6-3
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
	long double printValue;
	t.iNum=0,t.fNum=0,t.dNum=0;

	t.iNum = (long)('a'+1.3);	//1.3의 실수부분에서 데이터 손실발생
	printValue = ('a'+1.3);
	printf("형변환 : %d, long double 값 : %lf\n",t.iNum,printValue);

	t.fNum = 2.49+t.iNum;		//
	printValue = 2.49 + printValue;
	printf("형변환 : %f, long double 값 : %lf\n",t.fNum,printValue);

	t.dNum=(double)t.fNum*t.iNum;
	printValue = printValue*('a'+1.3);
	printf("형변환 : %lf, long double 값 : %lf\n",t.dNum,printValue);

	printf("long double의 사이즈 %d",sizeof(printValue));
	
	return 0;
}//*/
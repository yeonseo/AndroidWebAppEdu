/**************************
chap7_173.c
남연서
예제 7-1
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

	t.iNum=0,t.iResult=0 ;						//구조체 주소값에 변수입력

	while(t.iNum<=10)
	{
		t.iResult=t.iResult+t.iNum;
		printf("t.iNum = %d, result = %d\n",t.iNum,t.iResult);
		t.iNum++;
	}
	printf("************반복문 종료************\n");
	return 0;
}//*/
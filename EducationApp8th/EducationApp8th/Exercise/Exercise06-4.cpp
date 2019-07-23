/**************************
Exercise06-4.c
남연서
연습문제 6-4
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
	t.iNum=0;

	printf("ASCII 코드를 입력하세요 :");
	scanf("%d",&t.iNum);
	for(;t.iNum<65 || t.iNum>90;)
	{
		printf("65부터 90사이로 코드를 입력하시오 :");
		scanf("%d",&t.iNum);
		while(getchar()!='\n');
	}
	
	printf("입력한 ASCII코드는 %d이고, 문자는 %c 입니다.:\n",t.iNum,t.iNum);	//. 사용  ??왜지??
	return 0;
}//*/
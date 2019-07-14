/**************************
Problem7-285_6.c
남연서
연습문제 7-285_6번
입력:없음(void)
출력:return값(0)
**************************/
//계산기
/*
#include <stdio.h>
int main()
{
	int num1=0, num2=0, result=0;
	char input=0;
	do
	{
		while(input!='A'&&input!='S'&&input!='M'&&input!='D'&&input!='Q') //연잔 제대로 받기
		{
			printf("********************\nA ---- Add\nS ---- Subtract\nM ---- Multiply\nD ---- Divide\nQ ---- Quit\n********************\n");
			printf("연산을 선택하세요 : ");
			scanf("%c",&input);
			while( getchar() != '\n' );						//버퍼에 남은 데이터 없애기
			if(input>96) input=input-32;					//소문자로 입력할 시 대문자로 변환
			//printf("%c\n",input);							//대문자로 바뀐 것 확인하기
		}
		if(input=='Q') break;
			
		do
		{
			printf("1과 100사이의 두 수를 공백으로 분리하여 입력하세요 : ");
			scanf("%d %d",&num1,&num2);
			while( getchar() != '\n' );						//버퍼에 남은 데이터 없애기
		}while((num1<1||num1>100)||(num2<1||num2>100));		//1에서 100부터 숫자만 받기

		if(input=='A') result=num1+num2;
		if(input=='S') result=num1-num2;
		if(input=='M') result=num1*num2;
		if(input=='D') result=num1/num2;
		printf("연산결과는 %d입니다.\n",result);
		input=0;											//연산 초기화하기
	}while(input!='Q');
	return 0;
}
//*/
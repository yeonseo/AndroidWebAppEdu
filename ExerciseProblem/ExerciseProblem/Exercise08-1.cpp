/**************************
Exercise08-1.c
남연서
연습문제 8-1
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int	main(void)
{
	int num1=0, num2=0, result=0;
	do
	{
		do
		{
			printf("정수1을 입력하시오 :");
			scanf("%d",&num1);
			printf("정수2를 입력하시오 :");
			scanf("%d",&num2);
		}while(num1<0||num1>100||num2<0||num2>100);
		
		if(num1==num2) break;
		result=(num1>num2)?(num1):(num2);
		printf("큰 수는 %d입니다. \n", result);

	}while(num1!=num2);
	return 0;
}//*/
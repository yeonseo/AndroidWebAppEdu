/**************************
Exercise08-5.c
남연서
연습문제 8-5
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int	main(void)
{
	int num1=0, num2=0, num3=0, result=0;
	do
	{
		do
		{
			printf("정수1을 입력하시오 :");
			scanf("%d",&num1);
			printf("정수2를 입력하시오 :");
			scanf("%d",&num2);
			printf("정수3를 입력하시오 :");
			scanf("%d",&num3);
		}while(num1<0||num1>100||num2<0||num2>100||num3<0||num3>100);
		
		if(num1==0||num2==0||num3==0) break;
		else if(num1>num2)
			result=(num1>num3)?(num1):(num3);
		else if(num2>num1)
			result=(num2>num3)?(num2):(num3);
		printf("큰 수는 %d입니다. \n", result);
	}while(num1!=0||num2!=0||num3!=0);
	return 0;
}//*/
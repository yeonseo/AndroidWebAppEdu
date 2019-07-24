/**************************
Exercise08-2.c
남연서
연습문제 8-2
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int	main(void)
{
	int num1=0, result=0;
	
	do
	{
		printf("정수를 입력하시오 :");
		scanf("%d",&num1);
	}while(num1<0||num1>1000);
	//printf("%d",num1);
	
	while(num1!=0)
	{
		result=num1%10;
		num1=num1/10;
		if(result%2==0)
			printf("%d : 짝수  ",result);
		else if(result%2==1)
			printf("%d : 홀수  ",result);
	}
	printf("\n");
	return 0;
}//*/
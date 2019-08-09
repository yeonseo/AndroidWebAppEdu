/**************************
Exercise07-1.c
남연서
연습문제 7-1
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#define NUM 100
int	main(void)
{
	int i=0, count=0;
	do
	{
		printf("1~10까지 숫자를 선택하시오 :");
		scanf("%d",&i);
	}while(i<1||i>10);

	printf("입력 : %d\n",i);
	
	for(;count*i<=NUM;count++)
	{
		printf("%d의 배수 : %d\n",i,count*i);
	}
		printf("%d의 배수 갯수 : %d\n",i,--count);
	return 0;
}//*/
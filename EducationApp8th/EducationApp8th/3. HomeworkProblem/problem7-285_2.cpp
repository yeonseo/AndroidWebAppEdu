/**************************
Problem7-285_2.c
남연서
연습문제 7-285_2번
입력:없음(void)
출력:return값(0)
**************************/
//for
/*
#include <stdio.h>
int main()
{
	int sum=0, input=0;

	for(;scanf("%d",&input)!=EOF;)
	{
		scanf("%d",&input);
		sum=sum+input;
			//printf("%d, sum값 = %d\n",i,sum);
	}

	printf("정수의 합은 %d입니다.\n", sum);
	return 0;
}
//*/
//while
/*
#include <stdio.h>
int main()
{
	int sum=0, input=0;

	while(scanf("%d",&input)!=EOF)
	{
		sum=sum+input;
	}

	printf("1부터 100사이의 모든 3의 배수의 합은 %d입니다.\n", sum);
	return 0;
}
//*/
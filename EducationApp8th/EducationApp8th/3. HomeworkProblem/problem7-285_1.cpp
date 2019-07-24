/**************************
Problem7-285_1.c
남연서
연습문제 7-285_1번
입력:없음(void)
출력:return값(0)
**************************/
//dp-while 문
/*
#include <stdio.h>
int main()
{
	int sum=0, i=0;

	do
	{
		i++;
		if(i%3==0)
		{
			sum=sum+i;
			//printf("%d, sum값 = %d\n",i,sum);
		}
	}while(i<=100);

	printf("1부터 100사이의 모든 3의 배수의 합은 %d입니다.\n", sum);
	return 0;
}
//*/
//while 문
/*
#include <stdio.h>
int main()
{
	int sum=0, i=0;

	while(i<=100)
	{
		i++;
		if(i%3==0)
		{
			sum=sum+i;
			//printf("%d, sum값 = %d\n",i,sum);
		}
	}

	printf("1부터 100사이의 모든 3의 배수의 합은 %d입니다.\n", sum);
	return 0;
}
//*/

//for문
/*
#include <stdio.h>
int main()
{
	int sum=0, i=0;

	for(i=1;i<=100;i++)
	{
		if(i%3==0)
		{
			sum=sum+i;
			//printf("%d, sum값 = %d\n",i,sum);
		}
	}

	printf("1부터 100사이의 모든 3의 배수의 합은 %d입니다.\n", sum);
	return 0;
}
//*/
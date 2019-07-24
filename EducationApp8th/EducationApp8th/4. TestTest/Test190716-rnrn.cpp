/**************************
Test190716구구단.c
남연서
구구단
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int i=0, j=0, input=0;
	do
	{                                                                                                                                                                                                                                                                                                                                                                                                                         
		printf("숫자를 입력하세요.");
		scanf("%d",&input);
	}while(input<0||input>9);

	for(i=input;i>=1;i--)
	{
		printf("****%d*****\n",i);
		for(j=1;j<=9;j++)
		{
			printf("%d * %d = %2d\n",i,j,i*j);
		}
	}
	return 0;
}
//*/
/*
#include <stdio.h>
int main()
{
	int i=0, j=0, input=0;

	do
	{
		printf("숫자를 입력하세요.");
		scanf("%d",&input);
	}while(input<0||input>9);

	for(i=input;i>=1;i--)
	{
		printf("******%d단 시작******\n",i);
		for(j=1;j<=9;j++)
		{
			printf("%d * %d = %2d\n",i,j,i*j);
		}
	}
	return 0;
}
//*/

/*
#include <stdio.h>
int main()
{
	int i=0, j=0;

	for(i=2;i<=9;i++)
	{
		printf("******%d단 시작******\n",i);
		for(j=1;j<=9;j++)
		{
			printf("%d * %d = %d\n",i,j,i*j);
		}
	}
	return 0;
}
//*/
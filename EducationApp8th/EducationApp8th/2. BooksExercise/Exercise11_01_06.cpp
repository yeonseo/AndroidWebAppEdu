/**************************
Exercise01-06.c
남연서
연습문제 01-06
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int i=0;
	char tablesChar[5]={'A','B','C','D','E'};
	int tablesInt[5]={10,20,30,40,50};
	double tablesDouble[5]={10.1,10.2,10.3,10.4,10.5};

	printf("********Char********\n");
	for(i=0 ; i<5 ; i++)
	{
		printf("배열 주소 : %x  배열값 : %c  \n",&tablesChar[i],*(tablesChar+i));
	}
	printf("\n");

	printf("********Int********\n");
	for(i=0 ; i<5 ; i++)
	{
		printf("배열 주소 : %x  배열값 : %d  \n",&tablesInt[i],*(tablesInt+i));
	}
	printf("\n");

	printf("********Double********\n");
	for(i=0 ; i<5 ; i++)
	{
		printf("배열 주소 : %x  배열값 : %lf  \n",&tablesDouble[i],*(tablesDouble+i));
	}
	printf("\n");

	return 0;
}
//*/
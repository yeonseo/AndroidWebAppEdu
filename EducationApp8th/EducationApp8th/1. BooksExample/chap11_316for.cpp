/**************************
chap11_316.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int i=0,j=0;
	int arrayInt[2][2]={10,20,30,40};

		printf("\n*************");
	for(i=0 ; i<4 ; i++)
	{
		if(i%2==0) printf("\n");
		printf("%x ",&arrayInt[i]);
		
	}
	printf("\n");

	printf("\n*************\n");
	for(i=0 ; i<2 ; i++)
	{
		for(j=0 ; j<2 ; j++)
		{
			printf("%x ",&arrayInt[i]);
		}
		printf("\n");
	}
	printf("\n");

	printf("\n*************");
	for(i=0 ; i<4 ; i++)
	{
		if(i%2==0) printf("\n");
		printf("%x ",*(arrayInt+i)+j);
	}
	printf("\n");

	return 0;
}
//*/
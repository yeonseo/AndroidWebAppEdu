/**************************
Exercise11_02_01.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int i=0,j=0,z=0;
	int arrayInt1[8]={1,2,3,4,5,6,7,8};

	printf("********Before********\n");
	for(j=0;j<2;j++)
	{
		for(z=0; z<4 ; z++)
		{
			printf("%d ",*(arrayInt1+i));
			i++;
		}
		printf("\n");
	}
	
	i=0;
	printf("********After********\n");
	for(j=0;j<4;j++)
	{
		printf("%d ",*(arrayInt1+i+4));
		printf("%d ",*(arrayInt1+i));
		i++;
		printf("\n");
	}
	return 0;
}
//*/
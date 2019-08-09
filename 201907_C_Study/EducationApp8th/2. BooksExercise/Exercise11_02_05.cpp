/**************************
Exercise11_02_05.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int i=0,j=0,z=0;
	int arrayInt[2][3]={1,2,3,4,5,6};

	printf("****************\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("배열 주소 : %x  배열값 : %d  \n",&arrayInt[i][j],*(*(arrayInt+i)+j));
		}
	}

	return 0;
}
//*/
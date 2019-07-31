/**************************
chap11_309.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int i=0,j=0,z=0;
	int arrayInt[3][3][3]={{1,2,3,4,5,6,7,8,9}, {10,11,12,13,14,15,16,17,18}, {19,20,21,22,23,24,25,26,27}};

	
	for(i=0 ; i<3 ; i++)
	{
		printf("\n*************\n");
		for(j=0 ; j<3 ; j++)
		{
			for(z=0 ; z<3 ; z++)
			{
				printf("%2d ",*(*(*(arrayInt+i)+j)+z));
				//printf("%2d ",*(*(arrayInt[i]+j)+z));
				//printf("%2d ",arrayInt[i][j][z]);
			}
			printf("\n");
		}
	}
	

	return 0;
}
//*/
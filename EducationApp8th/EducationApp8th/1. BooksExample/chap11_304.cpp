/**************************
chap11_304.c
������
���� 11_304
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int i=0,j=0;
	int secondaryArrayOne[4][3]={{1,2},{3},{4},{5}};
	int secondaryArrayTwo[4][3]={{1,2,3},{4,5,6},{7,8,9},{10}};


	for(j=0 ; j<4 ; j++)
	{
		for(i=0 ; i<3 ; i++)
		{
			printf("%2d ",*(secondaryArrayOne[j]+i));
		}
		printf("\n");
	}

	printf("\n**************\n");
	
	for(j=0 ; j<4 ; j++)
	{
		for(i=0 ; i<3 ; i++)
		{
			printf("%2d ",*(secondaryArrayTwo[j]+i));
		}
		printf("\n");
	}
	return 0;
}
//*/
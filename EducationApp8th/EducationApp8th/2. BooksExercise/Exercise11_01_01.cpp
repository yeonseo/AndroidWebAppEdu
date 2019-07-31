/**************************
Exercise11_01-01.c
남연서
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int main()
{
	unsigned const int arrXMax=1, arrYMax=6;		//배열 크기 정해주기
	char *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax];	//여러 값을 받기 위해서 포인터배열 사용하기
	int result=0, i=0, j=0,z=0, flag=0;
	
	while(1)
	{
		for(j=0 ; j<3 ; j++)
		{
			printf("수를 입력하시오 : ");
			scanf("%c",&arr[j][0]);
			while(getchar()!='\n');
		}
		for(j=0 ; j<arrYMax ; j++)
		{
			printf("arr[%d] : %c \n",j,arr[j][0]);
		}
		
		z=3;
		for(j=0;j<arrYMax;j++)
		{
			if(j<3) printf("arr[%d] : %c \n",j,arr[j][0]);
			else
			{
				z--;
				arr[j][i]=arr[z][i];
				printf("arr[%d] : %c \n",j,arr[j][0]);
			}
		}
	}
	return 0;
}
//*/
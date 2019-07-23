/**************************
Exercise07-6.c
남연서
연습문제 7-6
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int i=0, j=0;

	for(;1;)
	{
		printf("***두개의 숫자 중 -1을 입력하면 종료됩니다.***\n");
		printf("첫번째 수를 입력해 주세요 : ");
		scanf("%d",&i);
		printf("두번째 수를 입력해 주세요 : ");
		scanf("%d",&j);
		if(i==-1||j==-1) break;
		else if( (i>0&&i<=100) && (j>0&&j<=100) )
		{
			printf("%d + %d = %d\n\n",i,j,i+j);
			continue;
		}else continue;
		
		
	}
	return 0;
}//*/

/* //flag 사용
#include <stdio.h>
#include <stdlib.h>
int main()
{
	int num1=0, num2=0, flag2=0;
	for(;1;)
	{
		do
		{
			
			if (num1==-1||num2==-1)
			{
				exit(1);
			}else if(flag2!=0)
			{
				printf("숫자를 잘못입력하셨습니다 %d %d\n", num1, num2);
			}else
			{
				flag2=1;
			}
			printf("두수를 입력하세요.");
			scanf("%d %d",&num1,&num2);

		}while(num1<0||num1>100||num2<0||num2>100);

		printf("합은 %d 입니다.\n",num1+num2);
		flag2=0;
	}
	return 0;
}

//*/

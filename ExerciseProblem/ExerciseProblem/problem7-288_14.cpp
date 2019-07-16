/**************************
Problem7-288_13.c
남연서
연습문제 7-288_13번
입력:없음(void)
출력:return값(0)
**************************/
//for
/*
#include <stdio.h>
int main()
{
	int input=0,flag=0;
	while(input!=-1)
	{
		do
		{
			printf("\n수의 범위를 선택하세요(종료:-1) : ");
			scanf("%d",&input);;
			if(input==-1)
			{
				flag = 1;
				break;
			}
		}while(input<0||input>9999);

		if(flag==1) break;

		while(input!=0)
		{
			printf("%d",input%10);
			input=input/10;
		}
	}
	return 0;
}
//*/
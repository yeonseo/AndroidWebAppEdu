/**************************
Problem7-288_14.c
남연서
연습문제 7-288_14번
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
			if(input<0) printf("음수를 입력하셨습니다.\n");
			printf("\n수의 범위를 선택하세요(종료:-1) : ");
			scanf("%d",&input);;
			if(input==-1)
			{
				flag = 1;
				break;
			}else 
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

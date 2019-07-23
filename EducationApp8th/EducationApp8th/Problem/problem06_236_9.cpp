/**************************
Problem6-236_9.c
남연서
연습문제 6-236_9번
입력:없음(void)
출력:return값(0)
**************************/
/* 
#include <stdio.h>
int numInput(int a, int b);
int calculator(int a);
int main()
{
	int input1=0,flag=0,result=0;
	do
	{
		input1=numInput(-100, 100);
		if(input1==0)
		{
			flag=1;
			break;
		}
		result=calculator(input1);
		printf("f(x)값은 %d입니다.\n",result);
		if(flag==1) break;
	}while(input1!=0);
	return 0;
}
int numInput(int a, int b)
{
	int result;
	printf("정수를 입력 (종료 : 0) : ");
	do
	{
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
int calculator(int a)
{
	int result;
	if(a>0)
		return 7*a+2;
	else
		return a*a*a-9*a+2;
}
//*/
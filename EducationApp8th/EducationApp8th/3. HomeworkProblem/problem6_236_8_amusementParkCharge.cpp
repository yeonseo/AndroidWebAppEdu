/**************************
Problem6-236_8.c
남연서
연습문제 6-236_8번
입력:없음(void)
출력:return값(0)
**************************/
/* 
#include <stdio.h>
int numInput(int a, int b);
void charge(int a, int b);
int main()
{
	int input1=0,input2=0,flag=0;
	do
	{
		printf("현재시간과 나이를 입력 (종료 : 0) : ");
		input1=numInput(0, 24);
		input2=numInput(0, 100);
		if(input1==0||input2==0)
		{
			flag=1;
			break;
		}
		charge(input1, input2);
		if(flag==1) break;
	}while(input1!=0||input2!=0);
	return 0;
}
int numInput(int a, int b)
{
	int result;
	do
	{
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
void charge(int a, int b)
{
	if(a<17)
	{
		if(b<=3||b<=12||b>=65) printf("요금 : 25,000\n");
		else printf("요금 : 34,000\n");
	}
	else
		printf("요금 : 10,000\n");
}
//*/
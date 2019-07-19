/**************************
Problem6-236_7.c
남연서
연습문제 6-236_7번
입력:없음(void)
출력:return값(0)
**************************/
/* 
#include <stdio.h>
int numInput(int a, int b);
void possble(int a, int b);
int main()
{
	int input1=0,input2=0,i=0;
	do
	{
		printf("체중과 키를 입력 (종료 : 0) : ");
		input1=numInput(0, 200);
		input2=numInput(0, 200);
		if(input1==0||input2==0) break;
		possble(input1, input2);
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
void possble(int a, int b)
{
	int result;
	if(a>(b-100)*0.9)
		printf("%d : 과체중 \n",a);
	else
		printf("%d : 정상체중 \n",a);
}
//*/
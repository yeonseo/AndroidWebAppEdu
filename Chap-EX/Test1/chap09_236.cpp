/**************************
chap9_236.c
남연서
예제 9-2
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int numInput(int a, int b);
int max(int a, int b);
int min(int a, int b);

int main()
{
	int num1=0,num2=0,result=0;
	num1=numInput(1,100); 
	num2=numInput(1,100);

	result=max(num1,num2);
	printf("%d와 %d 중에서 큰 수는 %d입니다.\n",num1,num2,result);
	result=min(num1,num2);
	printf("%d와 %d 중에서 작은 수는 %d입니다.\n",num1,num2,result);
	return 0;
}

int numInput(int a, int b)
{
	int result;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
int max(int a, int b)
{
	if(a>b) return a;
	else	return b;
}
int min(int a, int b)
{
	if(a<b) return a;
	else	return b;
}//*/
/**************************
chap9_231.c
남연서
예제 9-1
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int numInput(int a, int b);
int sum(int a, int b);
int subtract(int a, int b);
double divide(double a, double b);

int main()
{
	int num1=0,num2=0,result=0;
	double res=0;
	num1=numInput(0,100); 
	num2=numInput(0,100);

	result=sum(num1,num2);
	printf("%d\n",result);

	result=subtract(num1,num2);
	printf("%d\n",result);

	res=divide(num1,num2);
	printf("%lf\n",res);

	return 0;
}
int sum(int a, int b)
{
	int result;
	result=a+b;
	return result;
}
int subtract(int a, int b)
{
	int result;
	result=a-b;
	return result;
}
double divide(double a, double b)
{
	double result;
	result=a/b;
	return result;
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
}//*/
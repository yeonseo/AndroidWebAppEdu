/**************************
chap9_239.c
남연서
예제 9-3
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
void information();
int numInput(int a, int b);
int sum(int a, int b);
int subtract(int a, int b);
double multiplication(double a, double b);
double divide(double a, double b);

int main()
{
	int num1=0,num2=0,result=0;
	double res=0;
	num1=numInput(1,100); 
	num2=numInput(1,100);

	information();

	result=sum(num1,num2);
	printf("****************\n* 덧셈결과 %d\n",result);

	result=subtract(num1,num2);
	printf("****************\n* 뺄셈결과 %d\n",result);

	res=multiplication(num1,num2);
	printf("****************\n* 곱셈결과 %lf\n",res);

	res=divide(num1,num2);
	printf("****************\n* 나눗셈결과 %lf\n",res);

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
double multiplication(double a, double b)
{
	double result;
	result=a*b;
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
}
void information()
{
	printf("\n\n*******연산시작******\n");
	return;
}
//*/
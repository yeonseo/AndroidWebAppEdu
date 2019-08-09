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
double numInput(double a, double b);
double divide(double a, double b);

int main()
{
	double num1=0,num2=0,res=0;
	num1=numInput(0,100); 
	num2=numInput(0,100);

	information();

	res=divide(num1,num2);
	printf("나눗셈결과 %lf\n",res);

	return 0;
}

double divide(double a, double b)
{
	double result;
	result=a/b;
	return result;
}
double numInput(double a, double b)
{
	double result;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%lf",&result);
	}while(result<a||result>b);
	printf("값이 %lf로 입력되었습니다.\n",result);
	return result;
}
void information()
{
	printf("\n\n******연산시작******\n");
	return;
}
//*/
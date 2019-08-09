/**************************
Exercise09-1.c
남연서
연습문제 9-1
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
void information();
int numInput(int a, int b);
int absolut(int a);
int main()
{
	int num=0,result=0;
	double res=0;
	num=numInput(-100,100); 
	information();
	result=absolut(num);
	printf("%d 입력 결과 : %d\n",num, result);
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
int absolut(int a)
{
	int i=0, result=0;
	if(a>0)
		return a;
	else
		return -a;
}
void information()
{
	printf("\n\n******절댓값 변환******\n");
	return;
}
//*/
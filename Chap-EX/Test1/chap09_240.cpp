/**************************
chap9_240.c
남연서
예제 9-4
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
void information();
int numInput(int a, int b);
int thirdTimeSum(int a);

int main()
{
	int num=0,result=0;
	double res=0;
	num=numInput(1,100); 

	information();

	result=thirdTimeSum(num);
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
int thirdTimeSum(int a)
{
	int i=0, result=0;
	for(i=0 ; i<=a ; i++)
	{
		result=result+i;
	}
	return result;
}

void information()
{
	printf("\n\n*******연산시작******\n");
	return;
}
//*/
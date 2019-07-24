/**************************
Problem6-235_2.c
남연서
연습문제 6-235_2번
입력:없음(void)
출력:return값(0)
**************************/
/* //swiitch
#include <stdio.h>
int main()
{
	int num1=0,num2=0;

	do
	{
		printf("첫 번째 수를 입력하시오 : ");
		scanf("%d",&num1);
		printf("첫 번째 수를 입력하시오 : ");
		scanf("%d",&num2);
	}while(num1<0||num1>100||num2<0||num2>num1);

	switch(num1%num2)
	{
		case 0:
			printf("%d / %d : 약수입니다. \n",num1,num2);
			break;
		default :
			printf("%d / %d : 약수가 아닙니다. \n",num1,num2);
			break;
	}
	return 0;
}//*/
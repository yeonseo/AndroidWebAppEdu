/**************************
Exercise02-5.c
남연서
연습문제 2-5
입력:없음(void)
출력:return값(0)
**************************/
/**/
#include <stdio.h>
int main()
{
	printf("더하고 싶은 두 개의 정수를 입력하세요.\n첫 번째 정수 : ");

	int Num1, Num2;
	scanf("%d",&Num1);
	printf("두 번째 정수 : ");
	scanf("%d", &Num2);
	printf("두 정수의 합은 : %d 입니다.\n",Num1+Num2);

	return 0;
}

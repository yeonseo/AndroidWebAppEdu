/**************************
Problem2-77_4.c
남연서
연습문제 2-77 4번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>

int main()
{
	int num;
	char *star = "******";
	char *starBlank = "*    *";

	for(num=0;num<5;num++)
	{
		printf("\n1,2,3번 중 출력하고 싶은 번호를 입력하세요.(종료는 0)");
		scanf("%d",&num);

		switch (num)
			{
			case 1:
				printf("%s\n%s\n%s\n%s\n",star,starBlank,starBlank,star);
				break;
			case 2:
				printf("%s\n%s\n%s\n%s\n%s\n%s\n",star,starBlank,starBlank,starBlank,starBlank,star);
				break;
			case 3:
				printf("  *  \n *** \n*****\n *** \n  *  \n");
				break;
			case 0:
				num=4;
			}
		}
	return 0;
}
*/
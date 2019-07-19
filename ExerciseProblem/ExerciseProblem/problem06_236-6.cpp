/**************************
Problem6-236_6.c
남연서
연습문제 6-236_6번
입력:없음(void)
출력:return값(0)
**************************/
/* //swiitch
#include <stdio.h>
int numInput(int a, int b);
int main()
{
	int input=0,i=0;
	do
	{
		input=numInput(0, 12);
		switch(input)
		{
			case 12:
				printf("%d월 (Dec.)입니다. \n",input);
				break;
			case 11:
				printf("%d월 (Nov.)입니다. \n",input);
				break;
			case 10:
				printf("%d월 (Oct.)입니다. \n",input);
				break;
			case 9:
				printf("%d월 (Sep.)입니다. \n",input);
				break;
			case 8:
				printf("%d월 (Aug.)입니다. \n",input);
				break;
			case 7:
				printf("%d월 (Jul.)입니다. \n",input);
				break;
			case 6:
				printf("%d월 (Jun.)입니다. \n",input);
				break;
			case 5:
				printf("%d월 (May.)입니다. \n",input);
				break;
			case 4:
				printf("%d월 (Apr.)입니다. \n",input);
				break;
			case 3:
				printf("%d월 (Mar.)입니다. \n",input);
				break;
			case 2:
				printf("%d월 (Feb.)입니다. \n",input);
				break;
			case 1:
				printf("%d월 (Jan.)입니다. \n",input);
				break;
		}
	}while(input!=0);
	return 0;
}
int numInput(int a, int b)
{
	int result;
	do
	{
		printf("몇 월인지  입력하시오 (종료 : 0) : ");
		scanf("%d",&result);
	}while(result<a||result>b);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
//*/
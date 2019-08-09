/**************************
Exercise07-5.c
남연서
연습문제 7-5
입력:없음(void)
출력:return값(0)
**************************/
/*//팩토리얼
#include <stdio.h>
int main()
{
	int i=1, num=0, sum=1;

	for(;1;)
	{
		for(;num<=0||num>10;)
		{
			printf("팩토리얼을 입력하시오 (1~10): ");
			scanf("%d",&num);
		}
		if(num>0||num<=10) break;
	}

	printf("당신이 입력한 값은 %d 입니다.\n",num);
		for (i=1;i<=num;i++)
	{
		sum=sum*i;
	}
	printf("계산된 팩토리얼 값은 %d입니다\n", sum);
	return 0;
}//*/
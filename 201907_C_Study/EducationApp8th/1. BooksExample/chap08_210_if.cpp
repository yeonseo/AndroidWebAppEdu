/**************************
chap8_210.c
남연서
예제 8-7
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",&num);
	}while(num<0||num>100);

	if(num<=100&&num>=90)
		printf("%d : A입니다. \n",num);
	if(num<90&&num>=80)
		printf("%d : B입니다. \n",num);
	if(num<80&&num>=70)
		printf("%d : C입니다. \n",num);
	if(num<70&&num>=60)
		printf("%d : D입니다. \n",num);
	if (num<=60) printf("과락입니다. \n");
	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",&num);
	}while(num<0||num>100);

	if(num<=100&&num>=90)
		printf("%d : A입니다. \n",num);
	else if(num<90&&num>=80)
		printf("%d : B입니다. \n",num);
	else if(num<80&&num>=70)
		printf("%d : C입니다. \n",num);
	else if(num<70&&num>=60)
		printf("%d : D입니다. \n",num);
	else
		printf("과락입니다. \n");
	return 0;
}//*/
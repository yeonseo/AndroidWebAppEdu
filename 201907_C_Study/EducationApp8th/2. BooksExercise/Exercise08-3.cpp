/**************************
Exercise08-3.c
남연서
연습문제 8-3
입력:없음(void)
출력:return값(0)
**************************/
/* // 다중 if
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		do
		{
			printf("수를 입력하시오 : ");
			scanf("%d",&num);
		}while(num<0||num>=100);

		if(num<=100&&num>=90)
			printf("%d : A입니다. \n",num);
		else if(num<90&&num>=80)
			printf("%d : B입니다. \n",num);
		else if (num<80) printf("%d : F입니다. \n",num);
	}while(num!=0);
	return 0;
}//*/

/* //swiitch
#include <stdio.h>
int main()
{
	int num=0,i=0;
	do
	{
		do
		{
			printf("수를 입력하시오 : ");
			scanf("%d",&num);
		}while(num<0||num>100);

		switch(num/10)
		{
			case 10:
			case 9:
				printf("%d : A입니다. \n",num);
				break;
			case 8:
				printf("%d : B입니다. \n",num);
				break;
			default :
				printf("%d : F입니다. \n",num);
				break;
		}
	}while(num!=0);
	return 0;
}//*/
/**************************
chap8_213.c
남연서
예제 8-10
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

	switch(num/10)
	{
		case 9 :
			printf("%d : A입니다. \n",num);
			break;
		case 8 :
			printf("%d : B입니다. \n",num);
			break;
		case 7 :
			printf("%d : C입니다. \n",num);
			break;
		case 6 :
			printf("%d : D입니다. \n",num);
			break;
		default :
			printf("%d : 과락입니다. \n",num);
			break;
	}
	return 0;
}//*/
/**************************
chap7_193.c
남연서
예제 7-16
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int	main(void)
{
	int i=0;

	do
	{
		printf("1~10까지 숫자를 선택하시오 :");
		scanf("%d",&i);
	}while(i<1||i>10);

	printf("입력하신 숫자는 %d 입니다.\n",i);

	i=0;

	for(;i<1||i>10;)
	{
		printf("1~10까지 숫자를 선택하시오 :");
		scanf("%d",&i);
	}
	printf("입력하신 숫자는 %d 입니다.",i);

	return 0;
}//*/

/*
#include <stdio.h>
int	main(void)
{
	//1. 1~10까지 숫자를 입력받는 기능을 진행하겠다.
	int i=0;
	
	do
	{
		printf("1~10까지 숫자 중 입력하세요 :");
		scanf("%d",&i);
	}while (i<1||i>10);

	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
   //1~10까지 숫자를 입력받는 기능

   int num=0;

   do
   {
      printf("숫자 입력(1~10): ");
      scanf("%d",&num);
   }while(num<1 || num>10);

   printf("입력된 수: %d",num);
return 0;
}//*/
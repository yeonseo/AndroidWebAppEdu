/**************************
chap8_216.c
남연서
예제 8-11
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int num=0,i=0;
	
	printf("문자를 입력하시오 : (F, T, S) ");
	scanf("%c",&num);

	switch(num)
	{
		case 'T' :
		case 't' :
			printf("목요일 \n");
			break;
		case 'F' :
		case 'f' :
			printf("금요일 \n");
			break;
		case 'S' :
		case 's' :
			printf("일요일 \n");
			break;
	}
	return 0;
}//*/
/*
#include <stdio.h>
int main()
{
	int num=0,i=0;
	
	printf("문자를 입력하시오 : (F, T, S) ");
	scanf("%c",&num);

	if(num=='T'||num=='t')
			printf("목요일 \n");
	else if(num=='F'||num=='f')
			printf("금요일 \n");
	else if(num=='S'||num=='s')
			printf("일요일 \n");
	return 0;
}//*/
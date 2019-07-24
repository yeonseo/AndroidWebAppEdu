/**************************
Problem6-2235_1.c
남연서
연습문제 6-235_1번
입력:없음(void)
출력:return값(0)
**************************/
/* //swiitch
#include <stdio.h>
int main()
{
	char num=0;
	do
	{
		printf("문자를 입력하시오 : ");
		scanf("%c",&num);
		while( getchar() != '\n' );
		if(num>96) num=num-32;
	}while(num<0||num>127);

	switch(num)
	{
		case 'E':
		case 'Y':
		case 'U':
		case 'I':
		case 'O':
		case 'A':
			printf("%c : 모음입니다. \n",num);
			break;
		default :
			printf("%c : 자음입니다. \n",num);
			break;
	}
	return 0;
}//*/
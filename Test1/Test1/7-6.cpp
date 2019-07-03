/**************************
7-6.c
남연서
for 문의 기본
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int numInt, numFin, cho;
	int num0=0;

	printf("초기값을 입력하세요 : ");
	scanf("%d",&numInt);
	
	printf("조건값을 입력하세요 : ");
	scanf("%d",&numFin);

	printf("사용할 비교연산자를 선택하세요.\n1.< 2.<= 3. >= 4.>\n숫자를 입력하세요 :");
	scanf("%d",&cho);

	switch (cho)
	{
		case 1:
			for(numInt;numInt<numFin;numInt++) 
			{
				printf("반복내용 : %d ",numInt);
				num0++;
				printf("반복횟수 : %d \n",num0);
			}
			break;

		case 2:
			for(numInt;numInt<=numFin;numInt++) 
			{
				printf("반복내용 : %d ",numInt);
				num0++;
				printf("반복횟수 : %d \n",num0);
			}
			break;

		case 3:
			for(numInt;numInt>=numFin;numInt++) 
			{
				printf("반복내용 : %d ",numInt);
				num0++;
				printf("반복횟수 : %d \n",num0);
			}
			break;

		case 4:
			for(numInt;numInt>numFin;numInt++) 
			{
				printf("반복내용 : %d ",numInt);
				num0++;
				printf("반복횟수 : %d \n",num0);
			}
			break;

		default:
			printf("1,2,3,4 중에 입력하세요.\n");
	printf("반복이 종료 된 후의 num : %d\n",numInt);
	}
	return 0;
}
*/
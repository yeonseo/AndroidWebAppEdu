/**************************
Exercise07-4.c
남연서
연습문제 7-4
입력:없음(void)
출력:return값(0)
**************************/
/*//출력할 단수를 입력 하는 경우
#include <stdio.h>
int	main(void)
{
	int i=0, j=0;
	for(;1;){							//무한 반복문 시작
		for(;i<2||i>19;)					//입력값이 2와 9사이인 경우만 넘어감
		{
		printf("출력할 단수 입력 : ");
		scanf("%d",&i);
		}
		if (i>=2||i<=19)					//입력값이 조건을 충족하면 실행 (2차 체크)
		{
			printf("**********%d단을 시작합니다**********\n",i);
			for(j=1;j<=9;j++)			//곱할 값 증가
			{
					printf("%d * %d = %d\n", i, j ,i*j);
			}
			break;
		}
	}
	return 0;
}//*/
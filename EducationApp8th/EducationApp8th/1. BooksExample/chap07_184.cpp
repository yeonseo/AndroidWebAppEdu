/**************************
chap7_184.c
남연서
예제 7-8
입력:없음(void)
출력:return값(0)
**************************/

/*//출력할 단수를 입력 하는 경우
#include <stdio.h>
int	main(void)
{
	int i=0, j=0;
	for(;1;){							//무한 반복문 시작
		for(;i<2||i>9;)					//입력값이 2와 9사이인 경우만 넘어감
		{
		printf("출력할 단수 입력 : ");
		scanf("%d",&i);
		}
		if (i>=2||i<=9)					//입력값이 조건을 충족하면 실행 (2차 체크)
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


/*//2단-9단 출력하는 경우
#include <stdio.h>
int	main(void)
{
	int i=0, j=0;
	for(i=2;i<=9;i++)						//단을 순차 입력 i++
	{
		printf("**********%d단을 시작합니다**********\n",i);
		for(j=1;j<=9;j++)					//j가 증가되며, j가 9를 넘으면 반복종료, i for문 시작
		{
			printf("%d * %d = %d\n",i,j,i*j);
		}
	}
	return 0;
}//*/



/*//양수만 입력받아 출력하는 경우
#include <stdio.h>
int	main(void)
{
	int num=0;
	for(;1;)
	{
		printf("양수만 입력하세요 : ");
		scanf("%d",&num);
		if(num>0)
			break;
	}
	printf("입력한 수는 %d입니다.\n",num);
	return 0;
}//*/
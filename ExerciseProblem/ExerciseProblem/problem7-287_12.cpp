/**************************
Problem7-287_12.c
남연서
연습문제 7-287_12번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int	main(void)
{
	int inputNum=0, fNum1=0, fNum2=0, fNum3=1, i=1;

	printf("몇 번째 피보나치 수열까지 출력하시겠습니까? : ");
	scanf("%d",&inputNum);

	for(i=0;i<=inputNum;i++)
	{
		if(i%2==0)									//짝수번째에선 fNum2에 저장
		{
			fNum2=fNum3;
			//printf("1-2) %d\n",fNum2);
			//printf("%d)\n",i);
		}else										//홀수번째에선 fNum1에 저장
		{
			fNum1=fNum3;
			//printf("1-1) %d\n",fNum1);
			//printf("%d)\n",i);
		}

		fNum3=fNum2+fNum1;
		printf("%d\n",fNum3);
		//printf("%d)\n",i);

	}
	printf("연산 결과 %번째 피보나치 값은 %d입니다.\n",inputNum,fNum3);
	return 0;
}//*/

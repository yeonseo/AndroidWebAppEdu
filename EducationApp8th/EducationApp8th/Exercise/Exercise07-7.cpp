/**************************
Exercise07-7.c
남연서
연습문제 7-7
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int grade[10]={};
	int next=0, i=0;
	double totalGrade=0;

	for(i=0;i<10;i++)
	{
		printf("**********%d번 과목**********\n",i+1);
		do
		{
			printf("%d번 과목의 점수를 입력해 주세요 : ",i+1);
			scanf("%d",&grade[i]);

			printf("입력한 수가 %d 맞습니까?\n맞으면 0, 틀리면 1 입력",grade[i]);
			scanf("%d",&next);
		}while(next>0);
		totalGrade=grade[i];
	}

	printf("열 과목 점수의 평균은 %lf입니다.\n",totalGrade);
	return 0;
}//*/

/* //flag 사용
#include <stdio.h>
#include <stdlib.h>
int main()
{
	int i=0,grade=0, sum=0, flag2=0;
	
	for(i=1;i<=10;i++)
	{
		do
		{
			
			if (grade==-1)
			{
				exit(1);
			}else if(flag2!=0)
			{
				printf("숫자를 잘못입력하셨습니다 %d\n",grade);
			}else
			{
				flag2=1;
			}
			printf("%d번째 점수를 입력하세요.",i);
			scanf("%d",&grade);

		}while(grade<0||grade>100);
		sum=sum+grade;
		printf("%d번째 과목까지 합은 %d, 평균은%d 입니다.\n",i,sum,sum/i);
		flag2=0;
	}
	return 0;
}

//*/

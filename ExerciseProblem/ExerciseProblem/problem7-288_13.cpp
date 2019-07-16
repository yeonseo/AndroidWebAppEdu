/**************************
Problem7-288_13.c
남연서
연습문제 7-288_13번
입력:없음(void)
출력:return값(0)
**************************/
//for
/*
#include <stdio.h>
int main()
{
	int result=1, n=0,r=0,i=0,flag=0;
	while(n!=-1||r!=-1)
	{
		do
		{
			printf("수의 범위를 선택하세요(종료:-1) : ");
			scanf("%d",&n);
			printf("택할 수의 범위를 선택하세요(종료:-1) : ");
			scanf("%d",&r);
			if(n==-1||r==-1)
			{
				flag = 1;
				break;
			}
		}while(n<0||n>100||r<0||r>n);
		if(flag==1) break;
		for(i=n;i>=(n-r-1);i--)
		{
			result=result*i;
			//printf("%d %d\n",i,result);
		}
		printf("%d부터 %d까지의 순열값은 %d입니다.\n\n",r,n,result);
	}
	return 0;
}
//*/
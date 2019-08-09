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

/*
#include <stdio.h>
int main()
{
	int  i=0,j=1,k=0,count=0, num=0, flag=0;

	do
	{
		printf("1-100 사이의 숫자를 입력하세요 : ");
		scanf("%d",&num);
	}while(num<1||num>100);

	for(i=0 ; i<=num ;)
	{
		k=i+j;
		printf("%d ",k);
		i=j;
		j=k;
	}
	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
	int  i=0,j=1,k=0,count=0, num=0, flag=0;

	do
	{
		printf("1-100 사이의 숫자를 입력하세요 : ");
		scanf("%d",&num);
	}while(num<1||num>100);

	for(i=0 ; i+j<=num ;)
	{
		k=i+j;
		printf("%d \n",k);
		//k=i+j;
		//printf("%d ",k);
		//i=j;
		//j=k;
		if(flag==0)
		{
			k=i+j;
			flag=1;
		}else if(flag==1)
		{
			i=k;
			flag=2;
		}else if(flag==2){
			j=k;
			flag=1;
		}
	}
	return 0;
}
//*/
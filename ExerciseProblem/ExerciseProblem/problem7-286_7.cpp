/**************************
Problem7-285_7.c
남연서
연습문제 7-285_7번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int	main(void)
{
	int divideNum=0, primeNum=0, count=0;

	for(primeNum=2;primeNum<=100;primeNum++)							//1부터 100까지 수 증가
	{
		count=0;
		//printf("gogo *********%d***********\n",primeNum);				//primeNum확인 작업
		for(divideNum=2;divideNum<=primeNum;divideNum++)				//나눌 수 증가
		{
			//printf("%d",divideNum);									//divideNum확인 작업
			//printf(" %d ",primeNum);									//primeNum확인 작업
			if(primeNum%divideNum==0) count++;
			//printf("%d\n",count);										//count확인 작업
		}

		if(count==1) printf("%d ",primeNum);
	}
	return 0;
}//*/

/*
#include <stdio.h>
int main()
{
	int  i=0,j=0,count=0,num=0;

	do
	{
		printf("2-100 사이의 숫자를 입력하세요 : ");
		scanf("%d",&num);
	}while(num<2||num>100);

	for (i=2; i<=num ; i++)
	{
		count=0;
		for(j=1 ; j<=i  ; j++)
		{
			if(i%j==0)
			{
				count++;
			}	
		}
		if(count==2)
		{
			 printf("%d ",i);
		}
		
	}
	return 0;
}
//*/
//#include <stdio.h>
//#include <stdlib.h>
/* //8번 문제
int main()
{
	int num=0,i=0, sum=0, flag=0;

	for(i=1;;i++)
	{
		do
		{
			printf("더할 수를 입력하세요 : ");
			scanf("%d",&num);
			if(num==-1)
			{
				flag=1;
				break;
			}
		}while(num<0||num>100);
		if(flag==1) break;
		sum=num+sum;
	}
	printf("합은 %d이고, %d번 연산했습니다.\n",sum,i-1);
	return 0;
}
//*/


/* //7번 문제
int main()
{
	int grade=0,i=0, sum=0, flag=0;

	for(i=1;i<=10;i++)
	{
		do
		{
			printf("%d번째 수를 입력하세요 : ",i);
			scanf("%d",&grade);
		}while(grade<0||grade>100);
		sum=grade+sum;
	}
	printf("평균은 %d입니다.\n",sum/i);
	return 0;
}
//*/



/* //6번 문제
int main()
{
	int num1=0, num2=0, i=0, flag=0;

	for(;;)
	{
		do
		{
			printf("첫번째 수를 입력하세요 : ");
			scanf("%d",&num1);
			printf("두번째 수를 입력하세요 : ");
			scanf("%d",&num2);
			if(num1==-1||num2==-1)
			{
				flag=1;
				break;
			}

		}while(num1<0||num1>100||num2<0||num2>100);
		if(flag==1) break;

		printf("연산결과는 %d입니다.\n",num1+num2);
	}
	return 0;
}
//*/



/* //5번 문제
int main()
{
	int input=0, i=0,result=1;

	do
	{
		printf("팩토리얼 연산을원하는 숫자를 입력하세요 : ");
		scanf("%d",&input);
	}while(input<0||input>100);

	for(i=input;i>=1;i--)
	{
		result=result*i;
	}
	printf("연산결과는 %d입니다.\n",result);
	return 0;
}
//*/



/* //4번 문제
int main()
{
	int input=0, i=0;

	do
	{
		printf("숫자를 입력하세요 : ");
		scanf("%d",&input);
	}while(input<1||input>19);

	for(i=1;i<=9;i++)
	{
		printf("%d * %d = %d\n",input, i, input*i);
	}
	return 0;
}
//*/



/* //1번 문제
int main()
 {
	int input=0, i=0;

	do
	{
		printf("1부터 100까지 숫자를 입력하세요 : ");
		scanf("%d",&input);
	}while(input<0||input>100);

	printf("%d의 배수 : ",input);
	for(i=1;i*input<=100;i++)
	{
		printf("%d ",input*i);
	}
	printf("\n %d의 배수 갯수 : %d ",input, i-1);
	return 0;
}
//*/

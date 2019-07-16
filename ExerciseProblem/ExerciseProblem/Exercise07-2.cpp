/**************************
Exercise07-2.c
남연서
연습문제 7-2
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("출력에 활용할 별 숫자를 입력하세요 : ");
	scanf("%d",&input);

	printf("\n\n========1번========\n");
	for(i=1;i<=input;i++)
	{
		for(k=(input-i);k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}

	printf("\n\n========2번========\n");
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		for(k=(input-i)+1;k>=1;k--)
		{
			printf("*");
		}
		printf("\n");
	}

	printf("\n\n========3번========\n");
	for(i=1;i<=input;i++)
	{
		for(k=(input-i)+1;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		printf("\n");
	}

	printf("\n\n========4번*******\n");
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		printf("\n");
	}

	printf("\n\n========5번========\n");
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		for(k=(input-i)*2+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=1;i<=input;i++)
	{
		for(k=(input-i)+1;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf(" ");
		}
		for(k=(input-i)+1;k>=1;k--)
		{
			printf("*");
		}
		printf("\n");
	}
	
	printf("\n\n========6번========\n");
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		for(k=(input-i)*2+1;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		printf("\n");
	}
	for(i=1;i<=input;i++)
	{
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf("*");
		}
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		printf("\n");
	}
	
	printf("\n\n========7번========\n");
	for(i=1;i<=input;i++)
	{
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf("*");
		}
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		printf("\n");
	}

	printf("\n\n========8번========\n");
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		for(k=(input-i)*2+1;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		printf("\n");
	}

	printf("\n\n========9번========\n");
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i*2;j++)
		{
			printf("*");
		}
		for(k=(input-i)*2;k>=1;k--)
		{
			printf(" ");
		}
		printf("\n");
	}
	for(i=1;i<=input;i++)
	{
		for(k=(input-i)*2;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i*2;j++)
		{
			printf(" ");
		}
		printf("\n");
	}
	
	printf("\n\n========10번========\n");
	for(i=1;i<=input;i++)
	{
		for(k=(input-i)*2;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i*2;j++)
		{
			printf(" ");
		}
		for(k=(input-i)*2;k>=1;k--)
		{
			printf("*");
		}
		printf("\n");
	}

}//*/
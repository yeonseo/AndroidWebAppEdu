/**************************
Exercise07-2.c
������
�������� 7-2
�Է�:����(void)
���:return��(0)
**************************/
/*
#include <stdio.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("��¿� Ȱ���� �� ���ڸ� �Է��ϼ��� : ");
	scanf("%d",&input);

	printf("\n\n========1��========\n");
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

	printf("\n\n========2��========\n");
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

	printf("\n\n========3��========\n");
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

	printf("\n\n========4��*******\n");
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

	printf("\n\n========5��========\n");
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
	
	printf("\n\n========6��========\n");
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
	
	printf("\n\n========7��========\n");
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

	printf("\n\n========8��========\n");
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

	printf("\n\n========9��========\n");
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
	
	printf("\n\n========10��========\n");
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
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
   int number=0, sum=0;
   
   for(number=1;(sum+number)<=10000;number++)
   {
      sum=sum+number;
   }
   printf("1���� %d������ ���� %d�Դϴ�. \n",number-1,sum);
   return 0;
}
//*/

/* //����ֱ� ����~
#include <stdio.h>
#include <windows.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("��¿� Ȱ���� �� ���ڸ� �Է��ϼ��� : ");
	scanf("%d",&input);

	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE), 4);
	for(i=5;i<=input;i++)
	{
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf("*");
		}
		for(k=(input-i)*2+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf("*");
		}
		printf("\n");
		Sleep(200);
	}
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i*2;j++)
		{
			printf(" ");
		}
		for(k=(input-i)*4+1;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		printf("\n");
	}
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE), 7);

	return 0;
}
//*/

/* //������ ��ī��
#include <stdio.h>
#include <windows.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("��¿� Ȱ���� �� ���ڸ� �Է��ϼ��� : ");
	scanf("%d",&input);

	//printf("\n\n========����========\n\n");
	printf("        �� ");
	Sleep(200);
	printf("�� ");
	Sleep(200);
	printf("�� ");
	Sleep(200);
	printf("�� ");
	Sleep(200);
	printf("�� ");
	Sleep(200);
	printf("�� ");
	Sleep(200);
	printf("�� \n");
	Sleep(200);
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE), 4);
	for(i=5;i<=input;i++)
	{
		for(k=(input-i)+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf("*");
		}
		for(k=(input-i)*2+1;k>=1;k--)
		{
			printf(" ");
		}
		for(j=1;j<=i*2-1;j++)
		{
			printf("*");
		}
		printf("\n");
		Sleep(200);
	}
	for(i=1;i<=input;i++)
	{
		for(j=1;j<=i*2;j++)
		{
			printf(" ");
		}
		for(k=(input-i)*4+1;k>=1;k--)
		{
			printf("*");
		}
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		printf("\n");
	}
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE), 7);

	return 0;
}
//*/

/* //����ֱ� ������~
#include <stdio.h>
#include <windows.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("��¿� Ȱ���� �� ���ڸ� �Է��ϼ��� : ");
	scanf("%d",&input);

	for(i=1;i<=8;i++)
	{
		for(j=8-i;j>=1;j--)
		{
			printf(" ");
		}
		for(k=1;k<=i*2-1;k++)
		{
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE), 16-i);
			printf("*");
		}
		printf("\n");
		Sleep(500);
	}
	return 0;
}
//*/


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

	printf("\n\n========����ver ���� �ΰ��� �ϱ�========\n\n");
		
   int i=0, j=0;

   for(i=1;i<=7;i++)
   {
      
   
      for(j=7;j-i>=0;j--)
      {
         printf(" ");
      }

      for(j=1;j<=i;j++)
      {
         printf("*");
      }

      
      printf("\n");
   }

   return 0;

}//*/
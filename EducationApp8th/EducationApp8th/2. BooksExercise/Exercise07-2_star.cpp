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
   int number=0, sum=0;
   
   for(number=1;(sum+number)<=10000;number++)
   {
      sum=sum+number;
   }
   printf("1부터 %d까지의 합이 %d입니다. \n",number-1,sum);
   return 0;
}
//*/

/* //색깔넣기 하투~
#include <stdio.h>
#include <windows.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("출력에 활용할 별 숫자를 입력하세요 : ");
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

/* //교수님 박카스
#include <stdio.h>
#include <windows.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("출력에 활용할 별 숫자를 입력하세요 : ");
	scanf("%d",&input);

	//printf("\n\n========용용번========\n\n");
	printf("        교 ");
	Sleep(200);
	printf("수 ");
	Sleep(200);
	printf("님 ");
	Sleep(200);
	printf("힘 ");
	Sleep(200);
	printf("내 ");
	Sleep(200);
	printf("세 ");
	Sleep(200);
	printf("요 \n");
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

/* //색깔넣기 뇸뇸뇸~
#include <stdio.h>
#include <windows.h>
int main()
{
	int input=0, i=0, j=0,k=0;
	printf("출력에 활용할 별 숫자를 입력하세요 : ");
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

	printf("\n\n========세미ver 변수 두개로 하기========\n\n");
		
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
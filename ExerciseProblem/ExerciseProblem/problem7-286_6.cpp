/**************************
Problem7-285_6.c
남연서
연습문제 7-285_6번
입력:없음(void)
출력:return값(0)
**************************/
//계산기

/*
#include <stdio.h>
#include <math.h>
#define PI 3.14
double add(double a, double b)
{
	double result;
	result=a+b;
	printf("%lf\n",result);
	return result;
}
double sub(double a, double b)
{
	double result;
	result=a-b;
	printf("%lf\n",result);
	return result;
}
double mul(double a, double b)
{
	double result;
	result=a*b;
	printf("%lf\n",result);
	return result;
}
double div(double a, double b)
{
	double result;
	if(b==0){
		printf("0을 나눌수 없습니다.\n");
		result=a;
		printf("결과값은 전 연산값 %lf로 유지합니다.\n",result);
	}else{
		result=a/b;
		printf("%lf\n",result);
	}
	return result;
}
double rad(double a)
{
	double result;
	result=a*PI/180.0;;
	printf("%lf\n",result);
	return result;
}
double root(double a)
{
	double result;
	result=sqrtl((long double)a);
	printf("%lf\n",result);
	return result;
}
void info()
{
	printf("********************\n");
	printf("*******YS-NAM*******\n");
	printf("A ---- 더하기\n");
	printf("S ---- 빼기\n");
	printf("M ---- 곱하기\n");
	printf("D ---- 나누기\n");
	printf("\n");
	printf("R ---- 호도법\n");
	printf("J ---- 제곱근\n");
	printf("\n");
	printf("C ---- 초기화\n");
	printf("E ---- 연산결과출력\n");
	printf("Q ---- 나가기\n");
	printf("********************\n");
}
int main()
{
	double num1=0, num2=0, result=0;
	char menu=0;
	int flag=0;
	
	info();
	printf("숫자를 입력하세요 : ");						//처음 계산할 숫자 받기
	scanf("%lf",&num1);
	while( getchar() != '\n' );	
	result=num1;										//처음받은 수 결과로 저장
	do
	{
		while(menu!='A'&&menu!='S'&&menu!='M'&&menu!='D'&&menu!='R'&&menu!='J'&&menu!='C'&&menu!='E'&&menu!='Q') //연산 제대로 받기
		{
			if(flag==1)
			{
				info();
				flag=0;
			}
			printf("연산을 선택하세요 (연산 메뉴 정보 : I 입력) : ");
			scanf("%c",&menu);
			while( getchar() != '\n' );					//scanf char형엔 꼭!!!! 버퍼에 남은 데이터 없애기
			if(menu>96) menu=menu-32;					//소문자로 입력할 시 대문자로 변환하도록 하기
			if(menu=='I') flag=1;
			//printf("%c",menu);						//대문자로 바뀐 것 확인하기
		}
		if(menu=='Q') break;
		if(menu=='E') printf("연산결과는 %lf입니다.\n",result);
		if(menu=='C')									//연산결과 초기화하기
		{
			result=0;
			menu=0;										//메뉴값도 초기화하기 (그래야 연산초기 선택으로 들어감)
			printf("%lf\n",result);
			printf("숫자를 입력하세요 : ");				//처음 계산할 숫자 받기
			scanf("%lf",&num1);
			while( getchar() != '\n' );	
			result=num1;
			continue;									//연산선택으로 돌아가기
		}

		if(menu=='R') result=rad(result);
		if(menu=='J') result=root(result);

		if(menu=='A'||menu=='S'||menu=='M'||menu=='D')	//사칙연산은 연산할 숫자가 더 필요하므로 값을 더 받기
		{
			printf("숫자를 입력하세요 : ");
			scanf("%lf",&num1);
			while( getchar() != '\n' );	

			if(menu=='A') result=add(result,num1);
			if(menu=='S') result=sub(result,num1);
			if(menu=='M') result=mul(result,num1);
			if(menu=='D') result=div(result,num1);
		}
		menu=0;											//연산 초기화하기
	}while(menu!='Q');
	return 0;
}
//*/

/* //제출용
#include <stdio.h>
#include <math.h>
#define PI 3.14
double add(double a, double b)
{
	double result;
	result=a+b;
	printf("%lf\n",result);
	return result;
}
double sub(double a, double b)
{
	double result;
	result=a-b;
	printf("%lf\n",result);
	return result;
}
double mul(double a, double b)
{
	double result;
	result=a*b;
	printf("%lf\n",result);
	return result;
}
double div(double a, double b)
{
	double result;
	if(b==0){
		printf("0을 나눌수 없습니다.\n");
		result=a;
		printf("결과값은 전 연산값 %lf로 유지합니다.\n",result);
	}else{
		result=a/b;
		printf("%lf\n",result);
	}
	return result;
}
double rad(double a)
{
	double result;
	result=a*PI/180.0;;
	printf("%lf\n",result);
	return result;
}
double root(double a)
{
	double result;
	result=sqrtl((long double)a);
	printf("%lf\n",result);
	return result;
}
void info()
{
	printf("********************\n");
	printf("*******YS-NAM*******\n");
	printf("A ---- 더하기\n");
	printf("S ---- 빼기\n");
	printf("M ---- 곱하기\n");
	printf("D ---- 나누기\n");
	printf("\n");
	printf("R ---- 호도법\n");
	printf("J ---- 제곱근\n");
	printf("\n");
	printf("C ---- 초기화\n");
	printf("E ---- 연산결과출력\n");
	printf("Q ---- 나가기\n");
	printf("********************\n");
}
int main()
{
	double num1=0, num2=0, result=0;
	char menu=0;
	int flag=0;
	
	info();
	printf("숫자를 입력하세요 : ");	
	scanf("%lf",&num1);
	while( getchar() != '\n' );	
	result=num1;		
	do
	{
		while(menu!='A'&&menu!='S'&&menu!='M'&&menu!='D'&&menu!='R'&&menu!='J'&&menu!='C'&&menu!='E'&&menu!='Q') //연산 제대로 받기
		{
			if(flag==1)
			{
				info();
				flag=0;
			}
			printf("연산을 선택하세요 (연산 메뉴 정보 : I 입력) : ");
			scanf("%c",&menu);
			while( getchar() != '\n' );	
			if(menu>96) menu=menu-32;	
			if(menu=='I') flag=1;
			//printf("%c",menu);	
		}
		if(menu=='Q') break;
		if(menu=='E') printf("연산결과는 %lf입니다.\n",result);
		if(menu=='C')	
		{
			result=0;
			menu=0;	
			printf("%lf\n",result);
			printf("숫자를 입력하세요 : ");
			scanf("%lf",&num1);
			while( getchar() != '\n' );	
			result=num1;
			continue;
		}

		if(menu=='R') result=rad(result);
		if(menu=='J') result=root(result);

		if(menu=='A'||menu=='S'||menu=='M'||menu=='D')
		{
			printf("숫자를 입력하세요 : ");
			scanf("%lf",&num1);
			while( getchar() != '\n' );	

			if(menu=='A') result=add(result,num1);
			if(menu=='S') result=sub(result,num1);
			if(menu=='M') result=mul(result,num1);
			if(menu=='D') result=div(result,num1);
		}
		menu=0;
	}while(menu!='Q');
	return 0;
}
//*/

/*
#include <stdio.h>
int main()
{
	double num1=0, num2=0, result=0;
	char menu=0;
	do
	{
		while(menu!='A'&&menu!='S'&&menu!='M'&&menu!='D'&&menu!='Q') //연산 제대로 받기
		{
			printf("********************\n");
			printf("A ---- Add\n");
			printf("S ---- Subtract\n");
			printf("M ---- Multiply\n");
			printf("D ---- Divide\n");
			printf("Q ---- Quit\n");
			printf("********************\n");
			printf("연산을 선택하세요 : ");
			scanf("%c",&menu);
			while( getchar() != '\n' );						//scanf char형엔 꼭!!!! 버퍼에 남은 데이터 없애기
			
			if(menu>96) menu=menu-32;					//소문자로 입력할 시 대문자로 변환
			//printf("%c\n",input);							//대문자로 바뀐 것 확인하기
		}
		if(menu=='Q') break;
			
		do
		{
			printf("1과 100사이의 두 수를 공백으로 분리하여 입력하세요 : ");
			scanf("%d %d",&num1,&num2);
			while( getchar() != '\n' );						//버퍼에 남은 데이터 없애기
		}while((num1<1||num1>100)||(num2<1||num2>100));		//1에서 100부터 숫자만 받기

		if(menu=='A') result=num1+num2;
		if(menu=='S') result=num1-num2;
		if(menu=='M') result=num1*num2;
		if(menu=='D') result=num1/num2;
		printf("연산결과는 %d입니다.\n",result);
		menu=0;												//연산 초기화하기
	}while(menu!='Q');
	return 0;
}
//*/

/*
#include <stdio.h>
int main()
{
	int num1=0, num2=0, result=0;
	char input=0;
	do
	{
		while(input!='A'&&input!='S'&&input!='M'&&input!='D'&&input!='Q') //연산 제대로 받기
		{
			printf("********************\nA ---- Add\nS ---- Subtract\nM ---- Multiply\nD ---- Divide\nQ ---- Quit\n********************\n");
			printf("연산을 선택하세요 : ");
			scanf("%c",&input);
			while( getchar() != '\n' );						//버퍼에 남은 데이터 없애기
			if(input>96) input=input-32;					//소문자로 입력할 시 대문자로 변환
			//printf("%c\n",input);							//대문자로 바뀐 것 확인하기
		}
		if(input=='Q') break;
			
		do
		{
			printf("1과 100사이의 두 수를 공백으로 분리하여 입력하세요 : ");
			scanf("%d %d",&num1,&num2);
			while( getchar() != '\n' );						//버퍼에 남은 데이터 없애기
		}while((num1<1||num1>100)||(num2<1||num2>100));		//1에서 100부터 숫자만 받기

		if(input=='A') result=num1+num2;
		if(input=='S') result=num1-num2;
		if(input=='M') result=num1*num2;
		if(input=='D') result=num1/num2;
		printf("연산결과는 %d입니다.\n",result);
		input=0;											//연산 초기화하기
	}while(input!='Q');
	return 0;
}
//*/
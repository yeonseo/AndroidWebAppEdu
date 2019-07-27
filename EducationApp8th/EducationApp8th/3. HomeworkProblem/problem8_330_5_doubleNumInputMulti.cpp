/**************************
Problem8-330_5.c
남연서
연습문제 8-330_5번
입력:없음(void)
출력:return값(0)
**************************/
/* ///double numInputMulti
#include <stdio.h>
#include <string.h>
#include <math.h>

int numInputMulti(double *pointArr, int numMin, int numMax);
void sin_degree(double degree);

#define PI 3.14

int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int i=0, flag=0;
	double arr[arrMax], result=0,*multiNum[arrMax];	//여러 값을 받기 위해서 포인터배열 사용하기
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],0, 10000);
			if(*multiNum[0]==0)
			{
				flag=1;
				break;
			}
			sin_degree(*multiNum[i]);
		}
		if(flag==1)	break;
	}
	return 0;
}
int numInputMulti(double *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%lf",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("값이 %lf로 입력되었습니다.\n",*pointArr);
	return 0;
}
void sin_degree(double degree)
{
	double mathResult=sin(degree*PI/180);
	printf("입력하신 %lf degree의 sin 값은 : (PI:3.14) %lf, (math.h사용) %lf \n",degree,(PI*degree)/180.0,mathResult);
}//*/
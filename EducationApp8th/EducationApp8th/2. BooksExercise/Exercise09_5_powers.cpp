/**************************
Exercise09-5.c
남연서
연습문제 9-5
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInput(int numMin, int numMax);
int numInputMulti(int *pointArr, int numMin, int numMax);
void powersOutput(int num);
int square(int num);
int cube(int num);
int quartic(int num);
int quintic(int num);

int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0;

	for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
	{
		multiNum[i]=&arr[i];
		numInputMulti(multiNum[i],1, 100);
	}
	powersOutput(*multiNum[0]);
	return 0;
}
int numInput(int numMin, int numMax)		// 리턴값 변수에 저장
{
	int result;
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",&result);
	}while(result<numMin||result>numMin);
	printf("값이 %d로 입력되었습니다.\n",result);
	return result;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
void powersOutput(int num)
{
	int j=0, a=0;
	printf("A TABLE OF POWERS\n");
	printf("----------------------------------------------------------\n");
	printf("  INTERGER      SQUARE        CUBE     QUARTIC     QUINTIC\n");
	printf("----------------------------------------------------------\n");
	
	for(j=0 ; j<3 ; j++)
	{
		a=num+j;
		printf("     %5d       %5d       %5d       %5d       %5d\n",a,square(a),cube(a),quartic(a),quintic(a));
	}
}
int square(int num)
{
	return num*num;
}
int cube(int num)
{
	return num*num*num;
}
int quartic(int num)
{
	return num*num*num*num;
}
int quintic(int num)
{
	return num*num*num*num*num;
}
//*/
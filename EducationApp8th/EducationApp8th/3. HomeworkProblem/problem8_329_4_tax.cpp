/**************************
Problem8-329_4.c
남연서
연습문제 8-329_4번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void get_tax(int incom);

int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0, flag=0;
	
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
			
			get_tax(*multiNum[i]);
		}
		if(flag==1)	break;
	}
	return 0;
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
void get_tax(int incom)
{
	if(incom<=1000)
	{
		printf("소득 : %d  세금 : %.2lf \n",incom, incom*0.08);
	}else
	{
		printf("소득 : %d  세금 : %.2lf \n",incom, incom*0.1);
	}
}//*/
/**************************
Problem8-331_10.c
남연서
연습문제 8-331_10번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void isMutiple(int num1,int num2);

int main()
{
	unsigned const int arrMax=2;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0, flag=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-1, 100);
			if(arr[0]==-1||arr[1]==-1)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)	break;
		isMutiple(*multiNum[0],*multiNum[1]);
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		printf("수를 입력하시오 : (종료 : -1)");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
void isMutiple(int num1,int num2)
{
	if(num1%num2==0)
	{
		printf("정수 %d(은)는 %d의 배수입니다. \n\n",num1, num2);
	}else
	{
		printf("정수 %d(은)는 %d의 배수가 아닙니다. \n\n",num1, num2);
	}
}//*/
/**************************
Problem8-329_1.c
남연서
연습문제 8-329_1번
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);
void sniffling(int input);
void absolute(int input);
void sign(int input);

int main()
{
	unsigned const int arrMax=1;		//배열 크기 정해주기
	int *multiNum[arrMax];				//여러 값을 받기 위해서 포인터배열 사용하기
	int arr[arrMax], result=0, i=0, counting=0, flag=0;
	
	while(1)
	{
		for(i=0 ; i<arrMax; i++)			//포인터 배열에 결과값 받기 사용
		{
			multiNum[i]=&arr[i];
			numInputMulti(multiNum[i],-100, 100);
			if(*multiNum[0]==0)
			{
				//printf("총 연산 횟수 : %d\n",counting);
				flag=1;
				break;
			}
			
			sniffling(*multiNum[i]);
			absolute(*multiNum[i]);
			sign(*multiNum[i]);
		}
		if(flag==1)	break;
		//counting++;							//연산횟수 카운팅
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
void sniffling(int input)
{
	if(input<0)
	{
		input=-input;
		if(input%2==0)
			printf("%d : 짝수  \n",-input);
		else if(input%2==1)
			printf("%d : 홀수  \n",-input);
	}else
	{
		if(input%2==0)
			printf("%d : 짝수  \n",input);
		else if(input%2==1)
			printf("%d : 홀수  \n",input);
	}
}
void absolute(int input)
{
	if(input>0)
		printf("절댓값 : %d\n",input);
	else if(input<0)
		printf("절댓값 : %d\n",-input);
}
void sign(int input)
{
	if(input>0)
		printf("%d : 양수  \n",input);
	else if(input<0)
		printf("%d : 음수  \n",input);
	else
		printf("%d : 영점  \n",input);
}//*/
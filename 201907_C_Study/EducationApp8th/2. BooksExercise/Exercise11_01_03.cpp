/**************************
Exercise01-03.c
남연서
연습문제 01-03
입력:없음(void)
출력:return값(0)
**************************/
/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=5, arrYMax=3;		//배열 크기 정해주기
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//여러 값을 받기 위해서 포인터배열 사용하기
	int rowSum[3]={0,} , columnSum[3]={0,};
	int result=0,arrSum=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(j=0 ; j<arrYMax; j++)
		{
			for(i=0; i<arrXMax ; i++)			//포인터 배열에 결과값 받기 사용
			{
				multiNum[j][i]=&arr[j][i];
				numInputMulti(multiNum[j][i],0, 10000);
				if(*multiNum[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(j=0 ; j<arrYMax; j++)						//입력된 값과 row합 부분 출력하기
		{
			for(i=0; i<arrXMax ; i++)
			{
				arrSum = arrSum + arr[j][i];
				result = result + arr[j][i];
				printf("[%d][%d] : %2d   ",j,i,arr[j][i]);
			}
			printf("[%d][X] : %2d   \n",j,arrSum);
			arrSum=0;									//행이 끝나면 arrSum 초기화
		}
		
		for(i=0; i<arrXMax ; i++)						//col합 부분만 출력하기 위해서 더하기 반복
		{
			for(j=0 ; j<arrYMax; j++)					//i와 j를 반전시켜서 한 열씩 출력되도록 함
			{
				arrSum = arrSum + arr[j][i];
				//printf("[%d][%d] : %d   ",j,i,arr[j][i]);	 //입력값은 주석처리함
			}
			printf("[X][%d] : %2d   ",i,arrSum);
			arrSum=0;									//열이 끝나면 arrSum 초기화
		}
		printf("총 누적결과 : %2d   \n",result);
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		//printf("수를 입력하시오 : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;

}
//*/

/*
#include <stdio.h>
#include <string.h>

int numInputMulti(int *pointArr, int numMin, int numMax);

int main()
{
	unsigned const int arrXMax=5, arrYMax=3;		//배열 크기 정해주기
	int *multiNum[arrYMax][arrXMax], arr[arrYMax][arrXMax]={0,};	//여러 값을 받기 위해서 포인터배열 사용하기
	int result=0,arrSum=0, i=0, j=0, flag=0;
	
	while(1)
	{
		for(j=0 ; j<arrYMax; j++)
		{
			for(i=0; i<arrXMax ; i++)			//포인터 배열에 결과값 받기 사용
			{
				multiNum[j][i]=&arr[j][i];
				numInputMulti(multiNum[j][i],0, 10000);
				if(*multiNum[0][0]==0)
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)	break;
					
		for(j=0 ; j<arrYMax; j++)						//입력된 값과 row합 부분 출력하기
		{
			for(i=0; i<arrXMax ; i++)
			{
				arrSum = arrSum + arr[j][i];
				result = result + arr[j][i];
				printf("[%d][%d] : %2d   ",j,i,arr[j][i]);
			}
			printf("[%d][X] : %2d   \n",j,arrSum);
			arrSum=0;									//행이 끝나면 arrSum 초기화
		}
		
		for(i=0; i<arrXMax ; i++)						//col합 부분만 출력하기 위해서 더하기 반복
		{
			for(j=0 ; j<arrYMax; j++)					//i와 j를 반전시켜서 한 열씩 출력되도록 함
			{
				arrSum = arrSum + arr[j][i];
				//printf("[%d][%d] : %d   ",j,i,arr[j][i]);	 //입력값은 주석처리함
			}
			printf("[X][%d] : %2d   ",i,arrSum);
			arrSum=0;									//열이 끝나면 arrSum 초기화
		}
		printf("총 누적결과 : %2d   \n",result);
	}
	return 0;
}
int numInputMulti(int *pointArr, int numMin, int numMax) // 리턴값 포인터 배열에 저장
{
	do
	{
		//printf("수를 입력하시오 : ");
		scanf("%d",pointArr);
	}while(*pointArr<numMin||*pointArr>numMax);
	//printf("값이 %d로 입력되었습니다.\n",*pointArr);
	return 0;
}
//*/